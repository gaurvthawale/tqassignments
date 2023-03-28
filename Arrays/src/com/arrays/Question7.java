package com.arrays;

public class Question7 {

	
	 
		
	
	
	 static void duplicateValues(int[] arr)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Duplicate values are: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
					continue;
				System.out.print(arr[i]+" ");
			}
		}
		
		
		System.out.println();
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		int[] arr = {3, 10, 90, 78, 56, 10, 78, 34, 61};
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		duplicateValues(arr);
	}

	

}
