package com.maven.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("reffConfig.xml");
		
		DependencyClass obj = (DependencyClass) context.getBean("depscy");
		System.out.println(obj.getX());
		System.out.println(obj.getObject().getY());
		
//		object of class DependencyClass
		System.out.println(obj);
	}
}
