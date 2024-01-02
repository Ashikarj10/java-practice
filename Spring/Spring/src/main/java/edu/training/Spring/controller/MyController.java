package edu.training.Spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.training.Spring.Interface.EmployeeRepo;
import edu.training.Spring.model.Employee;
import edu.training.Spring.service.EmpService;

@Controller
public class MyController {
	@Autowired
	EmployeeRepo repo;
	@Autowired
	Employee e;
	
	EmpService es = new EmpService ();

	@RequestMapping("/")
	public String homePage()
	{
		return "Home.jsp";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String displayPage(Employee emp)
	{
		repo.save(emp);
		es.add(emp);
		return "Created";
	}

	@RequestMapping("/view")
	public ModelAndView view()
	{
		List<Employee> el = (List<Employee>) repo.findAll();
		ModelAndView mv = new ModelAndView("view.jsp");
		System.out.println(el);
		mv.addObject("et",el);
		return mv;

	}
	 
	@RequestMapping("/search")
    public ModelAndView search(@RequestParam(value = "query", required = false) String query) 
	{
       List<Employee> el = repo.findBySearchQuery(query);
       ModelAndView mv = new ModelAndView("view.jsp");
       mv.addObject("et", el);
       return mv;
    }
}
