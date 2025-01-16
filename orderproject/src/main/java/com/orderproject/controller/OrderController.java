package com.orderproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderproject.entity.OrderDetails;
import com.orderproject.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	// http://localhost:9091/api/order
	//method: POST
	@PostMapping
	OrderDetails createOrderData(@RequestBody OrderDetails orderDetails) {
		OrderDetails createOrderData = orderService.createOrder(orderDetails);
		return createOrderData;
	}
	
	// http://localhost:9091/api/order
	// method: GET
	@GetMapping
	List<OrderDetails> getAllOrder(){
		List<OrderDetails> allOrder = orderService.getAllOrder();
		return allOrder;
	}
	
	// http://localhost:9091/api/order/id
	// method: GET
	@GetMapping("/{id}")
	Optional<OrderDetails> getOrderById(@PathVariable long id) {
		Optional<OrderDetails> orderById = orderService.getOrderById(id);
		return orderById;
	}
	
	// http://localhost:9091/api/order/id
	// method: PUT
	@PutMapping("/{id}")
	OrderDetails updateOrder(@PathVariable long id, @RequestBody OrderDetails orderDetails) {
		OrderDetails updateOrder = orderService.updateOrder(id, orderDetails);
		return updateOrder;
	}
	
	// http://localhost:9091/api/order/id
	// method: DELETE
	@DeleteMapping("/{id}")
	void deleteOrder(@PathVariable long id) {
		orderService.deleteById(id);
	}
}
