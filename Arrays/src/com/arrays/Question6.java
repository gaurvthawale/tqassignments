package com.arrays;

public class Question6 {

	
	 
		
	
	
	 static void commonElements(int[] arr1,int[] arr2)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Duplicate values are: ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])	
					System.out.print(arr1[i]+" ");
			}
		}
		
		
		System.out.println();
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		int[] arr1 = {12, 23, 34, 67 ,78, 91, 56};
		
		int[] arr2 = {39, 25, 15, 23, 55, 91, 66, 22};
		commonElements(arr1,arr2);
	}

	

}
