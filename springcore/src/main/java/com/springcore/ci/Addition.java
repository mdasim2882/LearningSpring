package com.springcore.ci;

public class Addition {

	private int a;
	private int b;

	Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Addition(double a, double b) {
		this.a =  (int)a;
		this.b =  (int)b;
		System.out.println("Called ... ");
	}

//	Addition(String a, String b) {
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//	}
	
	public void doSum()
	{
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
		
		System.out.println("Sum of two numbers = "+(this.a + this.b));
	}
}
