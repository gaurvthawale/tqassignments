package com.question2;

public class Employee2 {

	private int eid;
	private String ename;
	private float salary;
	private Date date;
	
	
	Employee2()
	{
		
	}
	 Employee2(int eid,String ename,float salary,Date date)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.date=date;
	}
	
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
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
	
	public void setDate(Date date)
	{
		this.date=date;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public String toString() 
	{
		return "Employee " + eid + " " + ename + " " + salary +" "+date;
	}
	
	
	
	
	
}
