package edu.training.productService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.training.productService.dbo.ProductReq;

@Controller
@RequestMapping("/product")
public class ProductController {
	

	@PostMapping
	public void createProduct(@RequestBody ProductReq productReq)
	{
   //    pro
	}
	
	

}
