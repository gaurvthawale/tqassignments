package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<>();
		
		studs.add(new Student(20,"zebra",29));
		studs.add(new Student(5,"ashok",25));
		studs.add(new Student(10,"dhrutrashtra",20));
		studs.add(new Student(7,"balak",23));
		
		for(Student s : studs)
		{
			System.out.println(s);
		}
		
		Collections.sort(studs,new RollNoComparator());
		System.out.println("------------ After Rollno Sorting -------------");
		
		for(Student s : studs)
		{
			System.out.println(s);
		}
		
		Collections.sort(studs,new NameComparator());
		System.out.println("------------ After Name Sorting -------------------");
		
		for(Student s : studs)
		{
			System.out.println(s);
		}
		
		Collections.sort(studs,new AgeComparator());
		System.out.println("------------ After Age Sorting ------------------");
		
		for(Student s : studs)
		{
			System.out.println(s);
		}
		
	}

}
