package com.account;

public class Account {
	
	public long accountNo;
	public String customerName;
	
	public Account()
	{
		System.out.println("I am in default ctor..");
		this.accountNo= 123456;
		this.customerName= "Gaurav";
	}
	
	public Account(long accountNo,String customerName)
	{
		System.out.println("I am in parameterized ctor..");
		this.accountNo= accountNo;
		this.customerName=customerName;
	}

}
