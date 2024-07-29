package com.practice.stereotype.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoMainUsingJavaConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanJava.class);
		ProductDao p1 = ctx.getBean(ProductDao.class);
		
		System.out.println("===> Product");
		p1.addProduct();
		p1.deleteProduct();
		p1.updateProduct();
		
		System.out.println("===> Order");
		OrderDao o1 = ctx.getBean(OrderDao.class);
		o1.placeOrder();
		o1.cancelOrder();
		o1.editOrder();
	}
}
