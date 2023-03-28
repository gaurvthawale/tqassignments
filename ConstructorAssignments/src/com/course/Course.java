package com.course;

public class Course {
	
	public int id;
	public String name;
	public SubCourse obj = new SubCourse();
	
	public Course()
	{
		System.out.println("Ctor of Course");
	}

}
