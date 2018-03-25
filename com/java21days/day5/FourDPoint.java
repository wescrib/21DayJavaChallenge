package com.java21days.day5;

import java.awt.Point;

public class FourDPoint extends Point {
	
	private int n1;
	private int n2;
	
	public FourDPoint(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		
	}
	
	public String print() {
		String m = "n1 is " + n1 + " and n2 is " + n2;
		System.out.println(m);
		
		return m;
		
	}

	public static void main(String[] args) {
		FourDPoint fdp = new FourDPoint(2, 3);
		
		fdp.print();
		System.out.println("Is FourDPoint an instance of Point from java.awt?");
		System.out.println(fdp instanceof Point);
		

	}

}
