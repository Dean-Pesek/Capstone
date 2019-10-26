package pesek.dean.capstoneapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pesek.dean.capstoneapi.models.Patient;
import pesek.dean.capstoneapi.repositories.PatientJpaRepository;

@RestController
public class PatientRestController {

	@Autowired
	private PatientJpaRepository patientRepo;
	
//	@GetMapping(path="/searchPatient/{firstName}/{lastName}")
//	@CrossOrigin
//	public List<Patient> searchPatientsByFirstAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
//		return patientRepo.findByFirstNameAndLastName(firstName, lastName
//	}
	
	@DeleteMapping(path="/deletePatient/{patientId}")
	@CrossOrigin
	public void deletePatient(@PathVariable int patientId) {
		patientRepo.deleteById(patientId);
	}
	
	@GetMapping(path="/getAllPatients")
	@CrossOrigin
	public List<Patient> getAllPatients() { 
		return patientRepo.findAll();
	}
	
	@GetMapping(path="/getPatient/{value}")
	@CrossOrigin
	public Patient getPatiendById(@PathVariable int value) {
		Optional<Patient> result = patientRepo.findById(value);
		return result.orElseThrow(() -> new RuntimeException());
	}
	
	@PatchMapping(path="/updatePatient")
	@CrossOrigin
	public void updatePatient(@RequestBody Patient patient) {
		patientRepo.saveAndFlush(patient);
	}
	
	@PostMapping(path="/createPatient")
	@CrossOrigin
	public void createPatient(@RequestBody Patient patient) {
		patientRepo.saveAndFlush(patient);
	}	
}