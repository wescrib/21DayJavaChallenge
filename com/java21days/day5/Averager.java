package com.java21days.day5;

public class Averager {

	public static void main(String[] kittykatlicklick) {
		int sum = 0;
		if(kittykatlicklick.length > 0) {
			for(int i=0; i <kittykatlicklick.length; i++) {
				sum += Integer.parseInt(kittykatlicklick[i]);
			}
			System.out.println("Sum is: " + sum);
			System.out.println("Average is: " + (float) sum/kittykatlicklick.length);
		}

	}

}
