package edu.training.springBootDemo1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootDemo1Application.class, args);
	    Employee e=ac.getBean(Employee.class);
	    
	    
	    System.out.println("---------------Emploee1-----------------");
	    e.setEid(1);
	    e.setEname("Ash");
	    e.setSal(10000);
	    e.displayEmp();
	    System.out.println("---------------Emploee2-----------------");
	    e.setEid(2);
	    e.setEname("Sathish");
	    e.setSal(20000);
	    e.setDept(ac.getBean(ItDept.class));
	    e.displayEmp();
	}

}
