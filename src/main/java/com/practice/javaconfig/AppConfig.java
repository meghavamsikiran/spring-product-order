package com.practice.javaconfig;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean("p1")
	public ProductDao productDaoOne() {
		return new ProductDao();
	}
	
	@Bean("p2")
	public ProductDao productDaoTwo() {
		return new ProductDao();
	}
	
	@Bean("o1")
	public OrderDao orderDaoOne() {
		return new OrderDao();
	}
	
	@Bean("o2")
	public OrderDao orderDaoTwo() {
		return new OrderDao();
	}
}
