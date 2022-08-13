package com.mindgate.main;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		Account account;
		account = new Savings(101, "janhavi", 3000, false);
		//account.withdraw(2000);
		System.out.println(account.withdraw(2000));
	}

}
