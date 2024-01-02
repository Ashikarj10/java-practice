package edu.training.eCart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import edu.training.eCart.Model.Products;
import edu.training.eCart.Service.productService;

@Controller
public class productController {
	
	@Autowired
	productService ps;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/add")
	public String Add(@RequestBody Products p) {
		ps.add(p);
		return "ADDED";}
		
//	@CrossOrigin(origins="http:localhost:4200")
//	@RequestMapping("/edit")
//	public void editProduct() 
//	{
//		
//	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/view")
	public List<Products> view() 
	{
		return ps.get();	
	}

//	@CrossOrigin(origins="http:localhost:4200")
//	@RequestMapping("/delete")
//	public void deleteProduct() 
//	{
//	
//	}
}
