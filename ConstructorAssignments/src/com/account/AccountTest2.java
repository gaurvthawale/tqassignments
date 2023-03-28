package com.account;

public class AccountTest2 {

	public static void main(String[] args) {
		
		Account a2 = new Account();
		System.out.println(a2.accountNo+" "+a2.customerName);
		
		Account a3 = new Account(34567123,"vaibhav");
		System.out.println(a3.accountNo+" "+a3.customerName);

	}

}
