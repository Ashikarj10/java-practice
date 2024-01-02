package edu.training.SpringSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	
	
	@RequestMapping("/public")
	@ResponseBody
	public String publicUser() {
		return "I'm Public";
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/admin")
	@ResponseBody
	public String adminUser() {
		return "I'm the Admin";
		
	}
	
	@PreAuthorize("hasRole('CUSTOMER')")
	@RequestMapping("/customer")
	@ResponseBody
	public String customerUser() {
		return "I'm the User";
		
	}
}
