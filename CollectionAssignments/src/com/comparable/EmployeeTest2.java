package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest2 {

	public static void main(String[] args) {
	
		List<Employee2> emp = new ArrayList<>();
		
		emp.add(new Employee2(1,"gaurav","manager",29));
		emp.add(new Employee2(5,"vaibhav","sales",25));
		emp.add(new Employee2(2,"milind","developer",18));
		emp.add(new Employee2(10,"rushikesh","manager",24));
		emp.add(new Employee2(9,"milind","sales",25));
		
		for(Employee2 e : emp)
		{
			System.out.println(e);
		}

		Collections.sort(emp);
		
		System.out.println("--------------------- After sorting on Name ----------------------");
		for(Employee2 e : emp)
		{
			System.out.println(e);
		}
		
	}

}
