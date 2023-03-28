package com.employee;

import java.util.Scanner;

public class Company {
	static Scanner sc = new Scanner(System.in);
	
	static void enterDept(Department d)
	{
		System.out.println("enter dept id: ");
		d.setDept_id(sc.nextInt());
		System.out.println("enter dept name: ");
		d.setDept_name(sc.next());
	}
	
	static void enterDate(MyDate date)
	{
		System.out.println("enter day: ");
		date.setDay(sc.nextInt());
		System.out.println("enter month: ");
		date.setMonth(sc.nextInt());
		System.out.println("enter year : ");
		date.setYear(sc.nextInt());
		
	}
	
	static void enteeEmployee(Employee e)
	{
		Department d = new Department();
		MyDate date = new MyDate();
		
		System.out.println("enter id: ");
		e.setId(sc.nextInt());
		System.out.println("enter name: ");
		e.setName(sc.next());
		System.out.println("enter salary : ");
		e.setSalary(sc.nextFloat());
		
		enterDept(d);
		e.setDepartment(d);
		enterDate(date);
		e.setMydate(date);
		
	}

	public static void main(String[] args) {

		
		Employee e1 = new Employee();
		enteeEmployee(e1);
		System.out.println(e1);
	}

}
