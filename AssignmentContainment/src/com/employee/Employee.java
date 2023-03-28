package com.employee;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private Department department;
	private MyDate mydate;

	Employee()
	{
		
	}

	public Employee(int id, String name, float salary, Department department, MyDate mydate)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.mydate = mydate;
	}

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

	public float getSalary() 
	{
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}

	public Department getDepartment() 
	{
		return department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}

	public MyDate getMydate()
	{
		return mydate;
	}

	public void setMydate(MyDate mydate)
	{
		this.mydate = mydate;
	}

	
	public String toString() 
	{
		return "Employee : " + id + " " + name + " " + salary + " " + department+ " "+ mydate;
	}
	
	
	
	
}
