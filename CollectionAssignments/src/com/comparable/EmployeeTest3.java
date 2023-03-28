package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest3 {

	public static void main(String[] args) {
	
		List<Employee3> emp = new ArrayList<>();
		
		emp.add(new Employee3(1,"gaurav","manager",29, new Profile("India","maharashtra")));
		emp.add(new Employee3(5,"vaibhav","sales",25, new Profile("America","maharashtra")));
		emp.add(new Employee3(2,"milind","developer",18, new Profile("Venezuela","maharashtra")));
		emp.add(new Employee3(10,"rushikesh","manager",24, new Profile("India","maharashtra")));
		emp.add(new Employee3(9,"milind","sales",25, new Profile("Australia","maharashtra")));
		
		for(Employee3 e : emp)
		{
			System.out.println(e);
		}

		Collections.sort(emp);
		
		System.out.println("--------------------- After sorting on Country ----------------------");
		for(Employee3 e : emp)
		{
			System.out.println(e);
		}
		
	}

}
