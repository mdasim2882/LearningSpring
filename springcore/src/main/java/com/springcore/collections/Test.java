package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectconfig.xml");
		Employee emp1 = (Employee) context.getBean("employee1");
		
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getContacts());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getDatabase().get("connectionName"));

	}

}
