package pesek.dean.capstoneapi.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pesek.dean.capstoneapi.models.Patient;

public interface PatientJpaRepository extends JpaRepository<Patient, Integer>{
	
//	@Query("SELECT p FROM Patient WHERE p.firstName = :firstName")
//	List<Patient> findByFirstName(@Param("firstName")String firstName);
//	
//	@Query("SELECT p FROM Patient WHERE p.firstName = :firstName AND p.lastName = :lastName")
//	List<Patient> findByFirstNameAndLastName(@Param("firstName")String firstName, @Param("lastName")String lastName);
//	
//	@Query("SELECT p FROM Patient WHERE p.firstName = :firstName AND p.lastName = :lastName AND dob = :dob")
//	List<Patient> findByFirstNameAndLastNameAndDob(@Param("firstName")String firstName, @Param("lastName")String lastName, @Param("dob")Date dob);
}
