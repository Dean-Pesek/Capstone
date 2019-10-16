package pesek.dean.capstoneapi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pesek.dean.capstoneapi.repositories.ClinicStaffJpaRepository;

@RestController
public class ClinicStaffRestController {

	ClinicStaffJpaRepository clinicStaffRepo;
	
	@GetMapping(path="")
	public boolean checkCridentials(HttpServletRequest request, HttpServletResponse response) {
		
		
		return authenticate("","", response);
	}
	
	private boolean authenticate(String username, String password, HttpServletResponse response) {
		if (username.equals("test") && password.equals("test")) {
			return true;
		} else {
			response.setStatus(403);
			return false;
		}
	}
}
