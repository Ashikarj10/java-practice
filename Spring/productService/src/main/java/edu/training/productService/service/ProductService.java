package edu.training.productService.service;

import org.springframework.stereotype.Service;

import edu.training.productService.dbo.ProductReq;
import edu.training.productService.model.Product;
import edu.training.productService.repository.ProductRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepo productRepo;
	
public void createNewProduct(ProductReq productReq) {
	
	Product product = new Product();
//	product.setPName(productReq.getPName());
//	product.setPrice(productReq.getPrice());
//	product.setQuantity(productReq.getQuantity());

	
}
}
