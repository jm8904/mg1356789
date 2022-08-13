package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.EmployeeRepositoryMain;
import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> empList = new ArrayList<>();

	public boolean addEmployee(Employee employee) {

		boolean result = empList.add(employee);
		return result;

	}

	public List<Employee> getAllEmp() {
		return empList;

	}

	public Employee getEmployeeByEmployeeId(int empId) {
		for (Employee employee : empList) {
			if (employee.getEmployeeId() == empId) {

				return employee;
			}
		}

		return null;

	}

	public boolean deleteEmployeeByEmployeeId(int eId) {
		for (Employee employee : empList) {
			if (employee.getEmployeeId() == eId) {
				boolean result = empList.remove(employee);
				return result;
			}
		}
		return false;

	}

	public boolean updateEmployeeId(Employee e) {
		for (Employee employee : empList) {
			if (employee.getEmployeeId() == e.getEmployeeId()) {
				employee.setName(e.getName());
				employee.setSalary(e.getSalary());
				return true;
			}

		}
		return false;
	}
}
