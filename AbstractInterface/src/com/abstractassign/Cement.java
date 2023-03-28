package com.abstractassign;




abstract class Equipment
{
	
	
	public void fill()
	{
		System.out.println("concrete method fill of eqipment");
	}
	
	public abstract void mix();
}


public class Cement extends Equipment {

	@Override
	public void mix()
	{
		System.out.println("In the mix method of cement class..");
		
	}
	
	public void pour()
	{
		System.out.println("pour method of cement class");
	}

	public static void main(String[] args)
	{
		Cement c = new Cement();
		
		c.mix();
		c.pour();
		c.fill();
		
		Equipment e = new Cement();
		
		e.mix();
		e.fill();
	}
}
