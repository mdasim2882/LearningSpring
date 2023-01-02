package com.springcore.ci;
import java.util.*;


public class Person {
	
	private int id;
	private String name;
	private Certificate certi;
	public List<String> visits;
	
	public Person(int id, String name, Certificate certi, List<String> visits) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
		this.visits = visits;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name +  ", certificate-name = "+ certi.name+ 
				", visits = "+ visits +"]";
	}
	
}
