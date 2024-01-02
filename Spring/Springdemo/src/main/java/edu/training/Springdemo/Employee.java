package edu.training.Springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    String Id;
    String Name;
    String Sal;
    String Dept;
//    public Employee() {}
    @Autowired
	public Employee(String id, String name, String sal, String dept) {
		super();
		Id = id;
		Name = name;
		Sal = sal;
		Dept = dept;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSal() {
		return Sal;
	}
	public void setSal(String sal) {
		Sal = sal;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	
	public void displayEmp() {
		
		System.out.println(Id+" "+Name+" "+Sal+" "+Dept);
		
	}
    
    
}
