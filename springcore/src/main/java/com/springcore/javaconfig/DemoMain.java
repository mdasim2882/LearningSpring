package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class DemoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student1 = context.getBean("student",Student.class);
		Student student2 = context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
//		student.study();
		
		Teacher teacher1 = context.getBean("teach", Teacher.class);
		Teacher teacher2 = context.getBean("teach", Teacher.class);
		teacher1.teaching();
		
		System.out.println(teacher1.hashCode());
		System.out.println(teacher2.hashCode());
		
		
		
	}

}
