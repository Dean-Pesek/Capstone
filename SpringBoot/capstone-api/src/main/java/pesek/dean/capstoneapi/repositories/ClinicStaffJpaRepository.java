package pesek.dean.capstoneapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pesek.dean.capstoneapi.models.ClinicStaff;

public interface ClinicStaffJpaRepository extends JpaRepository<ClinicStaff, Integer>{

	@Query("SELECT c FROM ClinicStaff WHERE c.username = :username AND c.password = :password")
	boolean matchUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}
