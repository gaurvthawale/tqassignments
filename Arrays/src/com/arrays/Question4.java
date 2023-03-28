package com.arrays;

public class Question4 {

	
	 
		
	
	
	 static void reverseArray(int[] arr)
	{
		// TODO Auto-generated method stub
		
		int temp[] = new int[arr.length];
		
		int j= arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[j];
			j--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= temp[i];
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
