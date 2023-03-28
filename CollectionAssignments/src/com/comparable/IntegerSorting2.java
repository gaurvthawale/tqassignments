package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSorting2 {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		
		al.add(12);
		al.add(9);
		al.add(50);
		al.add(30);
		al.add(10);
		al.add(35);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

	}

}
