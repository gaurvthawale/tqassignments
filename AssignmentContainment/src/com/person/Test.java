package com.person;

import java.util.Scanner;

public class Test {
	static Scanner sc= new Scanner(System.in);
	
	
	static void enterAddress(Address a)
	{
		System.out.println("Enter the city:");
		a.setCity(sc.next());
		System.out.println("Enter the state");
		a.setState(sc.next());
		System.out.println("enter the country");
		a.setCountry(sc.next());
	}
	
	static void enterPerson(Person p)
	{
		Address a= new Address();
		System.out.println("Enter the name:");
		p.setName(sc.next());
		System.out.println("Enter the gender:");
		p.setGender(sc.next());
		System.out.println("Enter the age:");
		p.setAge(sc.nextInt());
		enterAddress(a);
		p.setAddress(a);
	}
	public static void main(String[] args) {

		
		Person p1 = new Person();
		enterPerson(p1);
		System.out.println(p1);
	}

}
