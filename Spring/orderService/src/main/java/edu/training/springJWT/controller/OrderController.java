package edu.training.springJWT.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.training.springJWT.dto.OrderReq;
import edu.training.springJWT.service.OrderService;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController

@RequestMapping("/order")

public class OrderController {
	
	 private final OrderService orderSer;
	 @PostMapping
     public String placeOrder(@RequestBody OrderReq orderReq) 
     {
    	orderSer.placeOrder(orderReq);
		return "Order_Placed"; 
     }
}
