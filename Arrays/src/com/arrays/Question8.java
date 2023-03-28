package com.arrays;

public class Question8 {

	
	 
		
	
	
	 static boolean methoddebug(int[] arr1,int[] arr2)
	{
	
		boolean result = true;
		int i,j;
		int cnt;
		if(arr1.length!=arr2.length)
		{
			result =false;
			return result;
		}
		
		for( i=0;i<arr1.length;i++)
		{
			cnt=0;
			for( j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					cnt++;
					break;
				}
			}	
			if(cnt==0)
			{
				result=false;
				return result;
			}
		}	
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		
		
		int[] arr1= {12, 22, 32, 42, 52, 62};
		int[] arr2 = {12, 22, 32, 42, 52, 121};
		
			boolean t = methoddebug(arr1,arr2);
			System.out.println(t);
		
		
	}

	

}
