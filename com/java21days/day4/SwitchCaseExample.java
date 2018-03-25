package com.java21days.day4;

public class SwitchCaseExample {
	
	public static void grade() {
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("Great job!!");
			break;
		case 'B':
			System.out.println("Good job!!");
			break;
		case 'C':
			System.out.println("You can do better!!");
			break;
		default:
			System.out.println("Consider cheating!");
		}
	}
	
	public static void test() {
		int x = 2;
		switch (x) {
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("x is an even number");
			break;
		default:
			System.out.println("x is an odd number");
		}
	}

	public static void main(String[] args) {
		
		//BELOW IS AN EXAMPLE OF HOW NOT TO USE 'IF' AND 'ELSE IF' STATEMENTS OVER AND OVER
		
		grade();
		test();
		

	}

}
