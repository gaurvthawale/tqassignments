package com.question2;


public class EmployeTest {

	public static void sameJoiningDate(Employee2[] emp, Date[] date)
	{
		for(Date d: date)
		{
			System.out.println("Date: "+d+" ");
			for(Employee2 e : emp)
			{
				if(e.getDate().equals(d))
				{
					System.out.print(e.getEname()+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date[] date = new Date[3];
		
		date[0] = new Date(1,2,1994);
		date[1]= new Date(2,3,1995);
		date[2] = new Date(3,3,1996);
		
			Employee2[] emp = new Employee2[6];
		
		emp[0] = new Employee2(1,"gaurav",40000f,date[0] );
		emp[1] = new Employee2(2,"vaibhav",30000f,date[1]);
		emp[2] = new Employee2(3,"mohit",40000f,date[2]);
		emp[3] = new Employee2(4,"pratik",30000f,date[2]);
		emp[4] = new Employee2(5,"omkar",40000f,date[1]);
		emp[5] = new Employee2(6,"suraj",50000f,date[0]);
	
		
		
		//System.out.println(Arrays.toString(emp));
		for(Employee2 e:emp)
		{
			System.out.println(e);
		}
		System.out.println();
		sameJoiningDate(emp, date);
	}

}
