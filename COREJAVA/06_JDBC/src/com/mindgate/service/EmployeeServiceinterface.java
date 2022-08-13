package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceinterface {
	boolean addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	boolean deleteEmployeeByEmployeeId(int employeeId);

	boolean updateEmployeeByEmployeeId(int employeeId);
}
