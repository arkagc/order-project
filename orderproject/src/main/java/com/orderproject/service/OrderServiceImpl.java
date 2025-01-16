package com.orderproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderproject.entity.OrderDetails;
import com.orderproject.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepo orderRepo;
	
	// create order
	@Override
	public OrderDetails createOrder(OrderDetails orderDetails) {
		OrderDetails saveOrderData = orderRepo.save(orderDetails);
		return saveOrderData;
	}

	@Override
	public List<OrderDetails> getAllOrder() {
		List<OrderDetails> findAllOrderData = orderRepo.findAll();
		return findAllOrderData;
	}

	@Override
	public Optional<OrderDetails> getOrderById(Long id) {
		Optional<OrderDetails> findByOrderId = orderRepo.findById(id);
		return findByOrderId;
	}

	@Override
	public OrderDetails updateOrder(Long id, OrderDetails orderDetails) {
		Optional<OrderDetails> existOrder = orderRepo.findById(id);
		if(existOrder.isPresent()) {
			OrderDetails updateOrderData = existOrder.get();
			updateOrderData.setOrderDesc(orderDetails.getOrderDesc());
			updateOrderData.setOrderTotalValue(orderDetails.getOrderTotalValue());
			return orderRepo.save(updateOrderData);
		}
		return null;
	}

	@Override
	public void deleteById(Long id) {
		orderRepo.deleteById(id);
	}

}