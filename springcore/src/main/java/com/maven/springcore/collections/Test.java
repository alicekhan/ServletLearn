package com.maven.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext object = new ClassPathXmlApplicationContext("collectionConfig.xml");
		Emp emp = (Emp) object.getBean("emp1");
		// collection injection
		System.out.println("Emp String: "+emp.getName());
		System.out.println("Emp Set: "+emp.getAddresses());
		System.out.println("Emp List: "+emp.getPhones());
		System.out.println("Emp Map: "+emp.getCourses());
	}
}