package com.comparable;

public class Employee3 implements Comparable<Employee3> {
	
	private int id;
	private String name;
	private String designation;
	private int age;
	private Profile profile;
	
	Employee3()
	{
		
	}

	public Employee3(int id, String name, String designation, int age,Profile profile) {
	
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.profile=profile;
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
	
	public void setProfile(Profile profile)
	{
		this.profile=profile;
	}
	
	public Profile getProfile()
	{
		return profile;
	}

	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", profile="
				+ profile + "]";
	}

	@Override
	public int compareTo(Employee3 o) {
		
		return this.getProfile().getCountry().compareTo(o.getProfile().getCountry());
	}


	
	
	
	

}
