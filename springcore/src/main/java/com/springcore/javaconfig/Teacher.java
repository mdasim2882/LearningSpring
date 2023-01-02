package com.springcore.javaconfig;

public class Teacher {

	private Almonds almonds;
	
	public Almonds getAlmonds() {
		return almonds;
	}

	public void setAlmonds(Almonds almonds) {
		this.almonds = almonds;
	}

	public void teaching() {
		System.out.println("I'm teaching here...");
		this.almonds.display();
	}


	public Teacher(Almonds almonds) {
		super();
		this.almonds = almonds;
	}
}
