package com.java21days;

public class Box {
	
	private int height, weight, depth;

	public Box(int height, int weight, int depth) {
		
		this.height = height;
		this.weight = weight;
		this.depth = depth;
	}

	public static void main(String[] args) {
		
		Box thing = new Box(5,6,7);
		
		System.out.println(thing.height);
		System.out.println(thing.weight);
		System.out.println(thing.depth);
		

	}

}
