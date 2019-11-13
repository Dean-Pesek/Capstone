import React, { Component } from 'react'
import { DateTime } from 'luxon'

// import UpdateData from './ApiControllers/UpdateData'
import GetData from './ApiControllers/GetData'

export default class AppointmentView extends Component {
    constructor(props) {
        super(props)

        this.state = {
            appointments: [],
            messages: {
                noAppts: '',
            },
            clinicRooms: 0
        }
    }

    componentDidMount = () => {
        this.interval = setInterval(this.resetList, 120000)
        this.resetList()
    }

    resetList = () => {
        GetData('http://localhost:8080/appointment','today')
        .then(response => this.reloadAppts(response))
    }
 
    reloadAppts = (appts) => {
        let d = new Date()
        let current = DateTime.fromMillis(d.getTime())
        appts = appts.filter((a) => {
            let guy = DateTime.fromMillis(a.date)
            return (current.month === guy.month && current.day === guy.day && current.year === guy.year && a.checkedIn)
        })
        if (appts.length > 0) {
            this.setState({appointments: appts})
        } else  {
            this.setState({messages: {noAppts: 'THERE ARE NO APPOINTMENTS TO SHOW'}})
        }
    }

    render() {
        return (
            <div>
                <h3>Checked-In Appointments</h3>
                <h3>{this.state.messages.noAppts}</h3>
                <div>
                    {
                        this.state.appointments.map((a, index) => {
                            let thing = <div className='appointmentPreview' key={index}>
                                    <p>{a.patient.lastName.substring(0,2)}, {a.patient.firstName.substring(0,2)}</p>
                                    <p>Doctor: {a.doctor.firstName} {a.doctor.lastName}</p>
                                    <p>{DateTime.fromMillis(a.date).toLocaleString({ weekday: 'short', month: 'short', day: '2-digit', hour: '2-digit', minute: '2-digit' })}</p>
                                </div>
                            return thing
                        })
                    }
                </div>
            </div>
        )
    }
}
