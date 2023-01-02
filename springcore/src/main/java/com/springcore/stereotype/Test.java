package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Employee employee= context.getBean("emp",Employee.class);
		System.out.println(employee);
		
		System.out.println(employee.getCourses());
		System.out.println(employee.getCourses().getClass().getName());
	}
	
}
