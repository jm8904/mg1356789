package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));

		String choice = request.getParameter("operation");
		PrintWriter out = response.getWriter();
		switch (choice) {
		case "Add":
			int result = num1 + num2;

			out.println("addition of  " + num1 + " & " + num2 + " is " + result);

			break;
		case "substract":

			int result2 = num1 - num2;

			out.println("substraction of  " + num1 + " & " + num2 + "  is " + result2);
			break;

		}

	}

}
