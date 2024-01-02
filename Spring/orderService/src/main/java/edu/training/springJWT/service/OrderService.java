package edu.training.springJWT.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.training.springJWT.dto.OrderReq;
import edu.training.springJWT.dto.orderLineItemsDto;
import edu.training.springJWT.model.Order;
import edu.training.springJWT.model.OrderLineItems;
import edu.training.springJWT.repository.OrderRepo;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService {
     private final OrderRepo orderRepo;
    //------------------------------------------------- 
     public void placeOrder(OrderReq orderReq) 
     {
    	 List<Order> or=new ArrayList<>(); 
    	 Order order=new Order();
    	 order.setOrderNo(UUID.randomUUID().toString());
    	 order.setOrderLineItems(orderReq.getOrderLineItemsDtoList().stream().map(dto->mapToDo(dto)).toList());
    	 orderRepo.save(order);
     }
    //------------------------------------------------- 
     public OrderLineItems mapToDo(orderLineItemsDto dto) 
     {
    	 return OrderLineItems.builder().id(dto.getId())

 				.name(dto.getName()).price(dto.getPrice())

 				.quantity(dto.getQuantity()).build();
     }
     
}
