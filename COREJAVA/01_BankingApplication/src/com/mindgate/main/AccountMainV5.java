package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountMainV5 {
	public static void main(String[] args) {
		Current current = new Current(101, "janhavi",10000, 50000);
		System.out.println("withdraw :: 5000");
		current.withdraw(5000);
		System.out.println("balance: " + current.getBalance() + "overdraftBalance : " + current.getOverdraftBalance());
		
		System.out.println();
		System.out.println("withdraw :: 10000");
		current.withdraw(10000);
		System.out.println("balance: " + current.getBalance() + "overdraftBalance : " + current.getOverdraftBalance());
		
		System.out.println();
		System.out.println("deposit :: 5000");
		current.deposit(5000);
		System.out.println("balance: " + current.getBalance() + "overdraftBalance : " + current.getOverdraftBalance());
		
		System.out.println();
		System.out.println("deposit :: 10000");
		current.deposit(10000);
		System.out.println("balance: " + current.getBalance() + "overdraftBalance : " + current.getOverdraftBalance());
	}

}
