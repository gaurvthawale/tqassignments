package com.arrays;

public class Question2 {

	
	 
		
	
	
	 static void secondMinimum(int[] arr)
	{
		// TODO Auto-generated method stub
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("second min element is :"+arr[1]);
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// [20, 0, 31, 45, 100, 1, 105, 90]
		
		int[] arr = {-20, 0, -25, 15, 19, 37, 23};
		
		secondMinimum(arr);
	}

	

}
