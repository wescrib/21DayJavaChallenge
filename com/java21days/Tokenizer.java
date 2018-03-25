package com.java21days;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		String dob = "12/07/1991";
		StringTokenizer formatted = new StringTokenizer(dob, "/");
		
		System.out.println(formatted.nextToken());
		System.out.println(formatted.nextToken());
		System.out.println(formatted.nextToken());
		
		

	}

}
