package com.practice.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsingXml {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/practice/usingxml/product.xml");
		ProductDao p1 = (ProductDao) ctx.getBean("productdao");
		OrderDao o1 = (OrderDao) ctx.getBean("orderdao");
		
		System.out.println("===> Product");
		p1.addProduct();
		p1.deleteProduct();
		p1.updateProduct();
		
		System.out.println("===> Order is done using Import");
		o1.placeOrder();
		o1.cancelOrder();
		o1.editOrder();
	}
}
