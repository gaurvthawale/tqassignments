package com.studept;

public class Student {
	
	private int roll;
	private String sname;
	private Department department;
	
	Student()
	{
		
	}
	
	Student(int roll, String sname,Department department )
	{
		this.roll = roll;
		this.sname = sname;
		this.department = department;
	}
	
	
	public int getRoll()
	{
		return roll;
	}

	public void setRoll(int roll)
	{
		this.roll = roll;
	}

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname) 
	{
		this.sname = sname;
	}

	public Department getDepartment()
	{
		return department;
	}
	
	public void setDepartment(Department department)
	{
		this.department = department;
	}

	
	public String toString()
	{
		return "Student: " + roll + " " + sname + " " + department;
	}
	
	

}
