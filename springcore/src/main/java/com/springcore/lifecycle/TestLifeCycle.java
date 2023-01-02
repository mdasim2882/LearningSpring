package com.springcore.lifecycle;

import javax.print.attribute.standard.Sides;
import javax.sound.midi.Soundbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa s = (Samosa) context.getBean("si");
		context.registerShutdownHook();
//		System.out.println(s);
		
//		Pepsi p = (Pepsi) context.getBean("pep");
//		System.out.println(p);
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
	}

}
