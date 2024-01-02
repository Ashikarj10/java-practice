package edu.training.Springdemo.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.training.Springdemo.Employee;

@Controller
public class HomeController {
	
	ArrayList<Employee> al=new ArrayList<Employee>();
	
	@RequestMapping("/addEmp")
	public void Add(String Id,String Name,String Sal,String Dept) {
		Employee e=new Employee(Id,Name,Sal,Dept);
		al.add(e);
	}
	
//	public String homePage()
//	{
//		return "demo.jsp";
//	}
//	
//	@RequestMapping("/display")
//	public ModelAndView homePage(String uname)
//	{
//		ModelAndView mav=new ModelAndView("display.jsp");
//		mav.addObject("uname",uname);
//		return mav;
//		
//	}

}
