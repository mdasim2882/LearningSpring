package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
		Employee employee = context.getBean("employee1",Employee.class);
		System.out.println(employee);
		System.out.println();
		System.out.println("Course class = " + employee.getCourses().getClass().getName());
		System.out.println("Contacts class = " + employee.getContacts().getClass().getName());
		System.out.println("Database class = " + employee.getDatabase().getClass().getName());
	}

}
