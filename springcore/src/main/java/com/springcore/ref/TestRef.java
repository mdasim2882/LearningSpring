package com.springcore.ref;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.print(a);
	}
}
