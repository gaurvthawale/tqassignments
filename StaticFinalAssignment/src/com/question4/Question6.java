package com.question4;

class Student
{
	
	String name;
	int id;
	static float marks;
	
	static void displayMarks()
	{
		System.out.println("Static method of superclass");
	}
	
	static void enterStudent()
	{
		System.out.println("Enter the student ");
	}
}

class SchoolStudent extends Student
{
	static void displayMarks()
	{
		System.out.println("Inside static method of sub class..");
		System.out.println(marks); 
		enterStudent();
	}
}

public class Question6 {
	
	

	public static void main(String[] args) {
		
		SchoolStudent st = new SchoolStudent();
		Student s1 = new Student();
		s1.displayMarks();
		s1 = new SchoolStudent();
		
	//	st.displayMarks();
	//	s1.displayMarks();
		
		System.out.println(	SchoolStudent.marks);// we can access static variable of superclass in subclass
		SchoolStudent.enterStudent();//  // we can inherit a static method of parent class in child class
		
		
		
		
	}

}
