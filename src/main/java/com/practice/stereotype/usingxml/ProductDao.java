package com.practice.stereotype.usingxml;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	public void addProduct() {
		System.out.println("Added a product");
	}
	
	public void deleteProduct() {
		System.out.println("Deleted a product");
	}
	
	public void updateProduct() {
		System.out.println("Updated the product");
	}
}
