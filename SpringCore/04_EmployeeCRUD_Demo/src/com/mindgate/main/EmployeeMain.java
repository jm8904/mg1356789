package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService", EmployeeServiceInterface.class);
		employeeServiceInterface.addEmployee();
		System.out.println("Main Ends");
	}

}
