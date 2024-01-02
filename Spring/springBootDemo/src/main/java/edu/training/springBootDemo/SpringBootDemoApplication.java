package edu.training.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringBootDemoApplication.class, args);
		Employee e=ac.getBean(Employee.class);
		e.displayEmp();
	}

}
