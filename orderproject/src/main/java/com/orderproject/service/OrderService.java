package com.orderproject.service;

import java.util.List;
import java.util.Optional;

import com.orderproject.entity.OrderDetails;

public interface OrderService {
	
	OrderDetails createOrder(OrderDetails orderDetails);  // create order
	List<OrderDetails> getAllOrder(); // get all order
	Optional<OrderDetails> getOrderById(Long id); // get order by id
	OrderDetails updateOrder(Long id, OrderDetails orderDetails); //update order
	void deleteById(Long id);
}
