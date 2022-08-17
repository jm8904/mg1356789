package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");
//		System.out.println("Creating the address object and calling set method");
//		
//		Address address = new Address();
//		address.setAddressId(1);
//		address.setHouseNumber("201");
//		address.setBuildingName("dharmveer");
//		address.setStreet("uthalsar");
//		address.setCity("thane");
//		address.setPin("400601");
//		
//		System.out.println(address);
//		System.out.println();
//		System.out.println("Creating the Employee object and set method");
//		
//		Employee employee = new Employee();
//		employee.setEmployeeId(101);
//		employee.setName("janhavi");
//		employee.setSalary(5000);
//		employee.setHomeAddress(address);
//		
//		System.out.println(employee);
		Address address = new Address(102, "201", "dharmveer", "uthalsar", "thane", "400601");
		
		Employee employee = new Employee(102, "janhavi more", 2000, address);
		System.out.println(employee);
		System.out.println("Main Ends");
	
	}

}
