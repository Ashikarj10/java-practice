package edu.training.Springbootdata.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
public class Employee {
	@Id
	private int id;
	private String Name;
	private String dept;
	private int salary;
	

}
