package com.question3;

public class Employee3 {

	private int eid;
	private String ename;
	private float salary;
	private Date date;
	private Department dept;
	
	
	Employee3()
	{
		
	}
	 Employee3(int eid,String ename,float salary,Date date,Department dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.date=date;
		this.dept=dept;
	}
	
	public Department getDept() 
	{
		return dept;
	}
	public void setDept(Department dept)
	{
		this.dept = dept;
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
		return "Employee " + eid + " " + ename + " " + salary +" "+date+" "+dept;
	}
	
	
	
	
	
}
