package edu.training.springBootDemo1;

import org.springframework.stereotype.Component;

@Component
public class ItDept implements Department {
	
	public String deptName() {
		return "IT";
	}

	@Override
	public String toString() {
		return "IT";
	}
	 
	

}
