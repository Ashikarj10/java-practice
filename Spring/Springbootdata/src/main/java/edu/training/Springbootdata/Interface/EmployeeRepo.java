package edu.training.Springbootdata.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="employee",path="employee")
public interface EmployeeRepo extends JpaRepository {

}
