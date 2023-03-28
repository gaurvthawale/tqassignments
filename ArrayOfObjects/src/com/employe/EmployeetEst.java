package com.employe;

import java.util.Arrays;

public class EmployeetEst {
	
	
	public static void sameSalary(Employee[] emp)
	{
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].getSalary()==emp[j].getSalary())
				{
					System.out.println(emp[i].getEname()+ " "+emp[j].getEname());
				}
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		Employee[] emp = new Employee[6];
		
		emp[0] = new Employee(1,"gaurav",40000f);
		emp[1] = new Employee(2,"vaibhav",30000f);
		emp[2] = new Employee(3,"mohit",40000f);
		emp[3] = new Employee(4,"pratik",30000f);
		emp[4] = new Employee(5,"omkar",40000f);
		emp[5] = new Employee(6,"suraj",50000f);
	
		
		
		//System.out.println(Arrays.toString(emp));
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		sameSalary(emp);
	}

}
