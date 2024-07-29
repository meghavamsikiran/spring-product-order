package com.practice.stereotype.usingxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainUsingStereoAnnotations {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanJava.class);
		ProductDao p = ctx.getBean(ProductDao.class);
		OrderDao o = ctx.getBean(OrderDao.class);
		
		System.out.println("===> Product");
		p.addProduct();
		p.deleteProduct();
		p.updateProduct();
		
		System.out.println("===> Order");
		o.placeOrder();
		o.cancelOrder();
		o.editOrder();
	}
}
