package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
	private String empName;
	private Map<String, Integer> courses;
	private List<Integer> contacts;
	private Properties database;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, Map<String, Integer> courses, List<Integer> contacts, Properties database) {
		super();
		this.empName = empName;
		this.courses = courses;
		this.contacts = contacts;
		this.database = database;
	}
	
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public List<Integer> getContacts() {
		return contacts;
	}
	public void setContacts(List<Integer> contacts) {
		this.contacts = contacts;
	}
	public Properties getDatabase() {
		return database;
	}
	public void setDatabase(Properties database) {
		this.database = database;
	}
	
	

}
