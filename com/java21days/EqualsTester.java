package com.java21days;

public class EqualsTester {

	public static void main(String[] args) {
		String s1, s2;
		
		s1 = "Boy, that escelated quickly.";
		s2 = s1;
		
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
		
		System.out.println("Same string?? : " + (s1 == s2));
		
		s2 = new String(s1);
		
		System.out.println("String1: " + s1);
		System.out.println("String 2: " + s2);
		
		System.out.println("Same string?? : " + (s1 == s2));
		System.out.println("Same string?? : " + (s1.equals(s2)));
		
	}

}
