package com.question4;

public class Car {

	static String model;
	int totalCarSold;
	
	public static void display()
	{
		System.out.println(model); // accessing static var in static methoid 
		System.out.println(totalCarSold); // accessing non static var inside static method
	}
	
	public static void display(int i)
	{
		System.out.println("with Static keyword overloaded");
	}
	
	public void display(int i, float j)
	{
		System.out.println("without Static keyword Overloaded");
		
	}
	public void display2()
	{
		System.out.println(model); //accessing static var in non static method
		System.out.println(totalCarSold); // accessing non static var in non static method
	}
	
	public static void main(String[] args) {
	
		System.out.println(Car.model);
		
		Car c1 = new Car();
		System.out.println(c1.totalCarSold);
		System.out.println();
	}

}
