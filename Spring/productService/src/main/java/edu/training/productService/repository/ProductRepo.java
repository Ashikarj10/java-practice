package edu.training.productService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.training.productService.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> 
{

 

} 
