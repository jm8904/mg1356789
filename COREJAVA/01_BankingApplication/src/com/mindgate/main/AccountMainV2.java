package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		System.out.println("this is accountmainv2");
		Account account = new Account(100, "test", 1000);
		System.out.println("withdraw : : 500");

		boolean result = account.withdraw(500);
		if (result) {
			System.out.println("transaction sucess!!");
		} else
			System.out.println("transaction fail!!");

		System.out.println(" balance ::" + account.getBalance());
	}
}
