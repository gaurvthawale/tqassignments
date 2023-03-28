package com.employee;

public class Department {
	/* . Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
*/
	private int dept_id;
	private String dept_name;
	
	Department()
	{
		
	}

	public Department(int dept_id, String dept_name)
	{
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public int getDept_id() 
	{
		return dept_id;
	}

	public void setDept_id(int dept_id)
	{
		this.dept_id = dept_id;
	}

	public String getDept_name()
	{
		return dept_name;
	}

	public void setDept_name(String dept_name) 
	{
		this.dept_name = dept_name;
	}

	
	public String toString() 
	{
		return "Department: " + dept_id + " " + dept_name;
	}
	
	
	
	
	
	
	

}
