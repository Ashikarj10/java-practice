package edu.training.Spring.Interface;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import edu.training.Spring.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>{
	@Query("SELECT e FROM Employee e WHERE " +
	           "e.id LIKE %:query% OR " +
	           "e.dept LIKE %:query% OR " +
	           "e.Sal LIKE %:query% OR " +
	           "e.Name LIKE %:query%")
	    List<Employee> findBySearchQuery(@Param("query") String query);
}
