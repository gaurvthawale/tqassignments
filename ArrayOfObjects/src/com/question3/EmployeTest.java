package com.question3;


public class EmployeTest {

	public static void sameDepartment(Employee3[] emp, Department[] dept)
	{
		for(Department d:dept)
		{
			System.out.println("Department: "+d.getDname()+" ");
			for(Employee3 e : emp)
			{
				if(e.getDept().getDname().equals(d.getDname()))
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
		
		Department[] dept = new Department[3];
		dept[0]= new Department(1,"sales");
		dept[1]= new Department(2,"product");
		dept[2]= new Department(3,"market");
		
		
			Employee3[] emp = new Employee3[6];
		
		emp[0] = new Employee3(1,"gaurav",40000f,date[0],dept[2] );
		emp[1] = new Employee3(2,"vaibhav",30000f,date[1],dept[1]);
		emp[2] = new Employee3(3,"mohit",40000f,date[2],dept[0]);
		emp[3] = new Employee3(4,"pratik",30000f,date[2],dept[2]);
		emp[4] = new Employee3(5,"omkar",40000f,date[1],dept[1]);
		emp[5] = new Employee3(6,"suraj",50000f,date[0],dept[0]);
	
		
		
		//System.out.println(Arrays.toString(emp));
		for(Employee3 e:emp)
		{
			System.out.println(e);
		}
		
		sameDepartment(emp, dept);
	}

}
