package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("Hello world");
		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("janhavi"); 
		account.setBalance(1000);

		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println("------------------------");

		Account account2 = new Account(102, "janhavi2", 2000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println(account2);
		

	}
}
