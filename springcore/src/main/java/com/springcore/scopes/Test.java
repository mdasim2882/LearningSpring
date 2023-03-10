package com.springcore.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/scopes/scopesconfig.xml");
		Employee employee1 = context.getBean("emp", Employee.class);
		Employee employee2 = context.getBean("emp", Employee.class);
		System.out.println(employee1);

//		System.out.println(employee.getCourses());
//		System.out.println(employee.getCourses().getClass().getName());

		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());

		Manager m1 = context.getBean("manager", Manager.class);
		Manager m2 = context.getBean("manager", Manager.class);

		System.out.println("Manager m1 = " + m1.hashCode());
		System.out.println("Manager m2 = " + m2.hashCode());
	}

}
