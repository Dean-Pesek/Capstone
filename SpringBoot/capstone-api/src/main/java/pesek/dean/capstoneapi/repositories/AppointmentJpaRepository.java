package pesek.dean.capstoneapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pesek.dean.capstoneapi.models.Appointment;

public interface AppointmentJpaRepository extends JpaRepository<Appointment, Integer>{

	@Query("SELECT a FROM Appointment WHERE a.patient = :patientId")
	List<Appointment> findByPatient(@Param("patientId")int patientId);
	
	@Query("SELECT a FROM Appointment WHERE a.doctor = :doctorId")
	List<Appointment> findByDoctor(@Param("doctorId")int doctorId);
	
	@Query("SELECT a FROM Appointment WHERE a.patient = :patientId AND a.doctor = :doctorId")
	List<Appointment> findByPatientAndDoctor(@Param("patientId")int patientId, @Param("doctorId")int doctorId);
}
