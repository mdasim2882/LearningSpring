package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class TestAutowire {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/annotationconfig.xml");
		Emp emp = context.getBean("emp", Emp.class);
		
		System.out.println(emp);
	}

}
