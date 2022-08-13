package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 {

	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		double amount;
		int choice;
		boolean result;
		String continueChoice;
		boolean isSalary;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your AccoutNumber");
		accountNumber = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter Your name");

		name = scanner.nextLine();

		System.out.println("Enter Your balance");
		balance = scanner.nextDouble();
		System.out.println("do you want to open salary account(true|false)");
		isSalary = scanner.nextBoolean();

		Savings account = new Savings(accountNumber, name, balance, isSalary);

		System.out.println(account);
		do {
			System.out.println("menu");
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.balance");

			System.out.println("enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("transaction sucess!!");
				} else
					System.out.println("transaction fail!!");

				System.out.println(" balance ::" + account.getBalance());
				break;
			case 2:

				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result) {
					System.out.println("transaction sucess!!");
				} else
					System.out.println("transaction fail!!");

				System.out.println(" balance ::" + account.getBalance());
				break;

			case 3:
				System.out.println(" balance ::" + account.getBalance());

			default:
				System.out.println("invalid input");
				break;
			}
			System.out.println("do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

	}
}
