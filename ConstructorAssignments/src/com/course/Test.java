package com.course;

public class Test {

	public static void main(String[] args) {
		
		
		 SubCourse sb1 = new SubCourse(); 
		 System.out.println(sb1.subCourseId+" "+sb1.subCourseName); 
		 
		Course cc1 = new Course();
		System.out.println(cc1.id+" "+cc1.name+" "+cc1.obj.subCourseId+" "+cc1.obj.subCourseName);

	}

}
