package com.mobilestore;


import java.util.Scanner;





public class MobileStore {

	static int pCount=0;
	static Scanner sc= new Scanner(System.in);
	
	public static void addMobile(Mobile m) 
	{
		System.out.println("Enter mobile id:");
		m.setMid(sc.nextInt());
		
		System.out.println("Enter mobile name:");
		m.setName(sc.next());
		
		System.out.println("Enter mobile brand:");
		m.setBrand(sc.next());
		
		System.out.println("Enter mobile price:");
		m.setPrice(sc.nextFloat());
		
		
	
	}
	
	public static void deleteMobile(Mobile[] marr, int mid)
	{
		boolean flag= false;
		
		for(int i=0;i<pCount;i++)
		{
			if(marr[i].getMid()==mid)
			{
				flag =true;
				
				System.out.println(marr[i].getName());
				
				for(int j=i;j<pCount-1;j++)
				{
					marr[j]=marr[j+1];
					
				}
				marr[pCount-1]=null;
				pCount=pCount-1;						
				System.out.println("Mobile deleted succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Mobile not found");
		
	}
	
	public static void updateMobile(Mobile[] marr, int mid)
	{
       boolean flag= false;
		
		for(int i=0;i<pCount;i++)
		{
			if(marr[i].getMid()==mid)
			{
				flag =true;
				System.out.println("Mobile details are:");
				System.out.println(marr[i]);
				
				System.out.println("Enter name:");
				marr[i].setName(sc.next());
				
				System.out.println("Enter price ");
				marr[i].setPrice(sc.nextFloat());
				
			
				System.out.println("Mobile updated succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Mobile not found");
		
	}
	
	public static void viewMobileByBrand(Mobile[] marr, String brand) 
	{
       boolean flag= false;
		
		for(int i=0;i<pCount;i++)
		{
			if(marr[i].getBrand().equals(brand))
			{
				flag =true;
				System.out.println("Mobile details are:");
				System.out.println(marr[i]);
				break;				
			}
		}
		
		if(!flag)
			System.out.println("Mobile not found");
		
	}
	
	
	public static void viewAllMobiles(Mobile[] marr)
	{

	
	System.out.println("-------------- Mobile List -----------------");

      for(int i=0;i<pCount;i++)
      {
    	  System.out.println(marr[i]);
      }
			
	}
	
	
	public static void main(String[] args) {
		
		Mobile[] m1= new Mobile[20];
 		 int choice;
 		 String ch;
    do
    {
   	 System.out.println("--------------- Mobile Store -----------------------");
   	 System.out.println("1.Add a mobile");
   	 System.out.println("2.Delete a mobile");
   	 System.out.println("3.Update a mobile");
   	 System.out.println("4.View mobile by brand");
   	 System.out.println("5.View all mobiles");
   	 System.out.println("0:EXIT");
   	 
   	 choice= sc.nextInt();
   	
   	 switch(choice)
   	 {
   	 case 1:if(pCount<m1.length)
   	        {
   		      m1[pCount]= new Mobile();
   		      addMobile(m1[pCount]);
   		      pCount++;
   		 
   	          }
   	        else
   	        {
   	    	   System.out.println("No more mobiles can be added.");
   	        }
     	          break;
     	          
   	 case 2: System.out.println("Enter mobile id to delete:");
   	         int mid= sc.nextInt();
   	         deleteMobile(m1, mid);
   	         break;
   	         
   	 case 3:System.out.println("Enter the mobile id to be updated:");
   	         mid= sc.nextInt();
   	         updateMobile(m1, mid);
     	     break; 
     	         
   	 case 4: System.out.println("Enter the brand to see mobiles :");
             String brand = sc.next();
             viewMobileByBrand(m1, brand);
	         break;   
	         
   	 case 5: viewAllMobiles(m1);
   	          break; 
   	        
   	default :
   			System.out.println("Invalid Choice...");
   	 }

     System.out.println("Do you want to perform more operation(yes/no)");	
     ch=sc.next();
   	 
    }while(ch.equalsIgnoreCase("yes"));

	}

}
