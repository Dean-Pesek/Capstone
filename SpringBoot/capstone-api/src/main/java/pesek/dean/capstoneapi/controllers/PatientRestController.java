package pesek.dean.capstoneapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pesek.dean.capstoneapi.models.Patient;
import pesek.dean.capstoneapi.repositories.PatientJpaRepository;

@RestController
public class PatientRestController {

	@Autowired
	private PatientJpaRepository patientRepo;
	
	@PostMapping(path="/createPatient")
	@CrossOrigin
	public void createPatient(@RequestBody Patient patient) {
		patientRepo.saveAndFlush(patient);
	}
	
}
