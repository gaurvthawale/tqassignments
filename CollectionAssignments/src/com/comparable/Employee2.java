package com.comparable;

public class Employee2 implements Comparable<Employee2> {
	
	private int id;
	private String name;
	private String designation;
	private int age;
	
	Employee2()
	{
		
	}

	public Employee2(int id, String name, String designation, int age) {
	
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee2 e) {
		
		if(this.name.equals(e.name))
			return this.id- e.id;
		else
			return this.name.compareTo(e.name);
	}
	
	
	

}
