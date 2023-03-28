package com.abstractassign;






abstract  class Employee {
	
	String name;
	int id;
	float hoursOfWork;
	float salary;
	
	Employee()
	{
		
	}
	
	Employee(int id, String name, float hoursOfWork)
	{
		this.id = id;
		this.name= name;
		this.hoursOfWork= hoursOfWork;
		
	}
	
	abstract public void salary(float hoursWork);
	
	public String toString()
	{
		return "Employee:"+id+" "+name+" "+hoursOfWork;
	}
}

class PartTimeEmployee extends Employee
{

	@Override
	public void salary(float hoursWork) {
		
		this.salary = hoursWork * 200f;
		System.out.println("Salary of Employee: "+salary);
	}
	
}

class FullTimeEmployee extends Employee
{

	@Override
	public void salary(float hoursWork) {
		
		this.salary = hoursWork * 500f;
		System.out.println("Salary of Employee: "+salary);
	}
	
}

public class TestEmployee
{
	public static void main(String[] args)
	{
		
	}
}

