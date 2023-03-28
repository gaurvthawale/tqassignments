package com.studept;

import java.util.Scanner;

public class College {
	
	static Scanner sc = new Scanner(System.in);
	
	static void enterStudent(Student s1) 
	{
		Department d = new Department();
		System.out.println("Enter student roll: ");
		s1.setRoll(sc.nextInt());
		System.out.println("Enter student name:");
		s1.setSname(sc.next());
		enterStudentDepartment(d);
		s1.setDepartment(d);
	}

	 static void enterStudentDepartment(Department d)
	 {
		 
		 System.out.println("Enter dept id : ");
		 d.setId(sc.nextInt());
		 System.out.println("Enter dept name: ");
		 d.setName(sc.next());
		 
	 }

	public static void main(String[] args) {
		
		Student s1 = new Student();
		enterStudent(s1);
		System.out.println(s1);
	}

	

}
