package com.springcore.ci;

public class Certificate {
	String name;
	
	Certificate(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}
	
	
}
