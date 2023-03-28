package com.question1;

class Student {
	
	private int id;
	private String name;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	

}

public class Demo
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setId(11);
		s2.setId(21);
		
	}
}
