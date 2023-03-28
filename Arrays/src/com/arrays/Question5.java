package com.arrays;

public class Question5 {

	
	 
		
	
	
	 static void reverseArray(int[] arr)
	{
		// TODO Auto-generated method stub
		
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[j];
			j--;
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// [20, 0, 31, 45, 100, 1, 105, 90]
		
		int[] arr = {20,0,31,45,100,1,105,90};
		
		reverseArray(arr);
	}

	

}
