package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
	
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1,"gaurav","manager",29));
		emp.add(new Employee(5,"vaibhav","sales",25));
		emp.add(new Employee(2,"mohit","developer",18));
		emp.add(new Employee(10,"rushikesh","manager",24));
		emp.add(new Employee(9,"milind","sales",25));
		
		for(Employee e : emp)
		{
			System.out.println(e);
		}

		Collections.sort(emp);
		
		System.out.println("--------------------- After sorting ----------------------");
		for(Employee e : emp)
		{
			System.out.println(e);
		}
		
		Collections.sort(emp, Collections.reverseOrder());
		
		System.out.println("--------------------- After descending sorting ----------------------");
		for(Employee e : emp)
		{
			System.out.println(e);
		}
	}

}
