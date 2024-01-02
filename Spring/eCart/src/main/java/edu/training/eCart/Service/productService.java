package edu.training.eCart.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.training.eCart.Model.Products;
import edu.training.eCart.Repo.productRepo;


@Service
public class productService {
	
	@Autowired
	productRepo pr;

	public Products add(Products p) {
		
	return	pr.save(p);
	
	}
	
	public List<Products>get(){
		return pr.findAll();
	}
 
}
