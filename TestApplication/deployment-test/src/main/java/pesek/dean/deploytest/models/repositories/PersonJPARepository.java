package pesek.dean.deploytest.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pesek.dean.deploytest.models.Person;

public interface PersonJPARepository  extends JpaRepository<Person, Integer>{

}
