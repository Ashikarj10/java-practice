package edu.training.springJWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.training.springJWT.model.Order;

public interface OrderRepo extends JpaRepository<Order,Integer>
{

}
