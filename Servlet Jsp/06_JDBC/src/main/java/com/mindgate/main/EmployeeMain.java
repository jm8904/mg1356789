package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceinterface;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceinterface employeeServiceinterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee ID : ");
		int employeeId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name : ");
		String name = scanner.nextLine();
		System.out.println(" enter Salary : ");
		double salary = scanner.nextDouble();
		Employee employee = new Employee(employeeId, name, salary);
		boolean result = employeeServiceinterface.addNewEmployee(employee);
		if (result) {
			System.out.println("insert successful");
		} else {
			System.out.println("insert failed");
		}

	}

}
