package edu.training.Spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.training.Spring.model.Employee;

@Service
public class EmpService {
	
		List<Employee> empList = new ArrayList<>();
		public void add(Employee emp)
		{
			empList.add(emp);

		}
		public List<Employee> display()
		{
			return empList;
		}
}
