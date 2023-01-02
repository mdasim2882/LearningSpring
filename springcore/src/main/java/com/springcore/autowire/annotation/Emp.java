package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	
	@Autowired
	@Qualifier("add1")
	private Address address1;
	@Autowired
	@Qualifier("add2")
	private Address address2;
	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
		System.out.println("Setting address 1 ...");
	}
	public Address getAddress2() {
		return address2;
	}
	

	public void setAddress2(Address address2) {
		System.out.println("Setting address 2 ...");
		this.address2 = address2;
	}
	
	public Emp(Address address1, Address address2) {
		super();
		System.out.println("Emp constructor called ...");
		this.address1 = address1;
		this.address2 = address2;
	}
	
//	@Autowired can NEVER be used here...
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Todo constructor called ...");
	}
	@Override
	public String toString() {
		return "Emp [address1=" + address1 + ", address2=" + address2 + "]";
	}

		
	
}
