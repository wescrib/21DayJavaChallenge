package com.java21days.day5;

public class Passer {
	void toUpperCase(String[] text) {
		for(int i=0; i < text.length; i++) {
			text[i] = text[i].toUpperCase();
		}
	}

	public static void main(String[] args) {
		Passer passer = new Passer();
		passer.toUpperCase(args);
		for(int i=0;i<args.length; i++) {
			System.out.println(args[i] + " ");
		}
		System.out.println("This is a test");
	}

}
