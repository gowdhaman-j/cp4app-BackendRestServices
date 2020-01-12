package com.ibm.demo;


import java.util.Date;

public class Order {

	private String OrderId;
	private java.util.Date OrderDate;
	private Double OrderAmount;
	private String OrderOwner;
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Order(String orderId, Date orderDate, Double orderAmount,
			String orderOwner) {
		super();
		OrderId = orderId;
		OrderDate = orderDate;
		OrderAmount = orderAmount;
		OrderOwner = orderOwner;
	}



	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}
	public Double getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		OrderAmount = orderAmount;
	}
	public String getOrderOwner() {
		return OrderOwner;
	}
	public void setOrderOwner(String orderOwner) {
		OrderOwner = orderOwner;
	}
	
	
}
