package com.employe;

public class Employee {

	private int eid;
	private String ename;
	private float salary;
	
	
	Employee()
	{
		
	}
	Employee(int eid,String ename,float salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	
	public String toString() 
	{
		return "Employee " + eid + " " + ename + " " + salary ;
	}
	
	
	
	
	
}
