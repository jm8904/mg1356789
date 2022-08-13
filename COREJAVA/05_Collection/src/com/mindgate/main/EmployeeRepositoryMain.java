package com.mindgate.main;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositoryMain {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee1 = new Employee(1, "test 1", 1000);
		Employee employee2 = new Employee(2, "test 2", 1000);
		Employee employee3 = new Employee(3, "test 3", 1000);
		employeeRepository.addEmployee(employee1);
		employeeRepository.addEmployee(employee2);
		employeeRepository.addEmployee(employee3);
//
//		System.out.println("before delete");
//		List<Employee> elist = employeeRepository.getAllEmp();
//		for (Employee employee : elist) {
//			System.out.println(employee);
//		}
//		
		
//		System.out.println("---------------------------------------------------");
//		Employee e = employeeRepository.getEmployeeByEmployeeId(2);
//		System.out.println(e);
		 
		
//		System.out.println();
//		System.out.println("after delete");
//		boolean res= employeeRepository.deleteEmployeeByEmployeeId(2);
//		 elist = employeeRepository.getAllEmp();
//		for (Employee employee : elist) {
//			System.out.println(employee);
//		}
		System.out.println();
		System.out.println("before update");
		List<Employee> elist1 = employeeRepository.getAllEmp();
		for (Employee employee : elist1) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println(" after Update");
		Employee updateEmployee = new Employee(2, "yyy", 10000);
		boolean result1 = employeeRepository.updateEmployeeId(updateEmployee);
		elist1 = employeeRepository.getAllEmp();
		for (Employee employee : elist1) {
			System.out.println(employee);
		}
	}

}
