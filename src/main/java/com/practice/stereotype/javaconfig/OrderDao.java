package com.practice.stereotype.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class OrderDao {
	
	public void placeOrder() {
		System.out.println("placed order");
	}
	
	public void cancelOrder() {
		System.out.println("cancelled order");
	}
	
	public void editOrder() {
		System.out.println("changed the order");
	}
}
