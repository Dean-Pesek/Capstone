package pesek.dean.capstoneapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pesek.dean.capstoneapi.models.Appointment;
import pesek.dean.capstoneapi.repositories.AppointmentJpaRepository;

@RestController
public class AppointmentRestController {
	
	AppointmentJpaRepository appRepo;
	
	@PostMapping(path="")
	public void createAppointment(@RequestBody Appointment app) {
		appRepo.saveAndFlush(app);
	}
	
	@GetMapping(path="")
	public List<Appointment> getAllAppointments() {
		return appRepo.findAll();		
	}

	//add a get for all appointments for that day
	
	@DeleteMapping(path="/{appointmentId}")
	public void deleteAppointmentById(@RequestParam("appointmentId")int appointmentId) {
		appRepo.deleteById(appointmentId);
	}
}
