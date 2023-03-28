package com.arrays;

public class Question3 {

	
	 
		
	
	
	 static void printingReverseArray(int[] arr)
	{
		// TODO Auto-generated method stub
		
	
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// [20, 0, 31, 45, 100, 1, 105, 90]
		
		int[] arr = {3, 90, 45, 29, 37, 78};
		
		printingReverseArray(arr);
	}

	

}
