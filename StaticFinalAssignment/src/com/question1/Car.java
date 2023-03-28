package com.question1;

public class Car {
	
	static String model;
	static int totalCarSold;
	

	public static void main(String[] args) {

		Car.model = "hyundai";
		Car.totalCarSold = 2;
		
		System.out.println(Car.model);
		System.out.println(Car.totalCarSold);
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.model = "hero-honda";
		c1.totalCarSold = 5;
		
		System.out.println(c2.model);
		System.out.println(c2.totalCarSold);
		
	}

}
