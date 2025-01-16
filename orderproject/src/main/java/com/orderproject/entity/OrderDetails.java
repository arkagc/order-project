package com.orderproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private long orderId;
	
	@Column(name = "order_desc")
	private String orderDesc;
	
	@Column(name = "order_total_value")
	private int orderTotalValue;
	
	public OrderDetails() {
		super();
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public int getOrderTotalValue() {
		return orderTotalValue;
	}

	public void setOrderTotalValue(int orderTotalValue) {
		this.orderTotalValue = orderTotalValue;
	}

	public OrderDetails(long orderId, String orderDesc, int orderTotalValue) {
		super();
		this.orderId = orderId;
		this.orderDesc = orderDesc;
		this.orderTotalValue = orderTotalValue;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderDesc=" + orderDesc + ", orderTotalValue=" + orderTotalValue
				+ "]";
	}
}
