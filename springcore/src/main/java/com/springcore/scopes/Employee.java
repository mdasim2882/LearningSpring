package com.springcore.scopes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {

	@Value("Mohd Asim")
	private String name;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double id;
	
	@Value("#{tempo}")
	private List<String> courses;
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
}
