package com.question10;

class FinalDemo {
	    final int x =10;
	    
	    final void display()
	    {
	    	System.out.println("FinalDemo Class");
	    }
	    
	    private void print()
	    {
	    	System.out.println("private methods inheritance..");
	    }
}

class FinalDemoChild extends FinalDemo
{
// cannot override final methods from parent class
//	final void display()
//	{
//		System.out.println("FinalDemoChildClass")
//	}
	
}

public class Demo
{
	public static void main(String[] args) {
		
		FinalDemo ob = new FinalDemo();
		//ob.x = 15; // not chnage the value of final variable
		
		FinalDemoChild fv = new FinalDemoChild();
		fv.display(); // final methods are inherited..
		
		//fv.print(); // private methods are not inherited..

	}
}