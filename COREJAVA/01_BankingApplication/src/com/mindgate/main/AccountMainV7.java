package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountMainV7 {
	public static void main(String[] args) {

		AccountFactory a = new AccountFactory();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 : savings");
		System.out.println("Press 2 : Current");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		Account account = a.getAccount(choice);
		if (account instanceof Savings) {

			System.out.println("savings object is created!!!!!!");
		}
		if (account instanceof Current) {

			System.out.println("Current object is created!!!!!!");
		}

	}
}
