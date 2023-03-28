package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		
		al.add("gaurav");
		al.add("vaibhav");
		al.add("mohit");
		al.add("rushikesh");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

	}

}
