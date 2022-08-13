package com.mindgate.main;

import com.mindgate.pojo.Calculation;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Calculation calculation = new Calculation();
		calculation.accept();
		calculation.calculate();
		calculation.display();
		System.out.println("main end");
	}

}
