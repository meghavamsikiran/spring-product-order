package com.practice.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainUsingJavaConfig {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("===> p1 Product");
		ProductDao p1 = (ProductDao) ctx.getBean("p1");
		p1.addProduct();
		p1.deleteProduct();
		p1.updateProduct();
		
		System.out.println("\n===> o1 Order");
		OrderDao o1 = (OrderDao) ctx.getBean("o1");
		o1.placeOrder();
		o1.cancelOrder();
		o1.editOrder();
		
		System.out.println("\n===> p2 Product");
		ProductDao p2 = (ProductDao) ctx.getBean("p2");
		p2.addProduct();
		p2.deleteProduct();
		p2.updateProduct();
		
		System.out.println("\n===> o2 Order");
		OrderDao o2 = (OrderDao) ctx.getBean("o2");
		o2.placeOrder();
		o2.cancelOrder();
		o2.editOrder();
	}
}
