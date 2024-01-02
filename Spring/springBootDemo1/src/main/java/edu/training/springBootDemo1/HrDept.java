package edu.training.springBootDemo1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HrDept implements Department {
	public String deptName() {
//		System.out.println("Hr");
		return "HR";
		
	}

	@Override
	public String toString() {
		return "HR";
	}
}
