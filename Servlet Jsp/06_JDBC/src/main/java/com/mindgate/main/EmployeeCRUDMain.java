package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceinterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		int employeeId;
		String name;
		double salary;
		int choice;
		String continueChoice;
		List<Employee> allEmployees;
		EmployeeServiceinterface employeeServiceinterface = new EmployeeService();
		do {

			System.out.println("1. Add New Employee");
			System.out.println("2. update Employee");
			System.out.println("3. delete Employee");
			System.out.println("4. select one Employee");
			System.out.println("5. select all Employee");

			System.out.println("enter your choice");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter employee ID : ");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter name : ");
				name = scanner.nextLine();
				System.out.println(" enter Salary : ");
				salary = scanner.nextDouble();
				Employee employee = new Employee(employeeId, name, salary);
				boolean result = employeeServiceinterface.addNewEmployee(employee);
				if (result) {
					System.out.println("insert successful");
				} else {
					System.out.println("insert failed");
				}

				break;

			case 2:
//				System.out.println("Enter employee ID : ");
//				employeeId = scanner.nextInt();
//				scanner.nextLine();
//				System.out.println("Enter name to Update");
//				name = scanner.nextLine();
//				
//				result = employeeServiceinterface.updateEmployee(employee);
//				if (result) {
//					System.out.println("update successful");
//				} else {
//					System.out.println("update failed");
//				}

				
				break;
			case 3:
				System.out.println("Enter employee ID : ");
				employeeId = scanner.nextInt();
				
				result = employeeServiceinterface.deleteEmployeeByEmployeeId(employeeId);
				if (result) {
					System.out.println("delete successful");
				} else {
					System.out.println("delete failed");
				}


				break;
			case 4:
				


				break;
			case 5:
				allEmployees = employeeServiceinterface.getAllEmployees();
				for (Employee employee2 : allEmployees) {
					System.out.println(employee2);
				}

				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

	}

}
