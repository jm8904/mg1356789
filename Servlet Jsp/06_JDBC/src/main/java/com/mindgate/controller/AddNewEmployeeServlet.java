package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceinterface;

/**
 * Servlet implementation class AddNewEmployeeServlet
 */
@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {
	int employeeId;
	String name;
	double salary;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		employeeId = Integer.parseInt(request.getParameter("employeeId"));
		name = request.getParameter("employeename");
		salary = Double.parseDouble(request.getParameter("salary"));
		
		Employee employee =new Employee(employeeId, name, salary);
		EmployeeServiceinterface employeeServiceinterface = new EmployeeService();
		
		boolean result = employeeServiceinterface.addNewEmployee(employee);
		
		if (result) {
			response.sendRedirect("index.jsp");
		}else {
			PrintWriter out = response.getWriter();
			out.println("failed to add employee");
		}
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.println("empID : " + employeeId + "<br>");
//		out.println("empName : " + name + "<br>");
//		out.println("empSalary : " + salary + "<br>");
	}

}
