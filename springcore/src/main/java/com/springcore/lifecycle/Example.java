package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Calling START method ...");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Calling END method ...");
	}

}
