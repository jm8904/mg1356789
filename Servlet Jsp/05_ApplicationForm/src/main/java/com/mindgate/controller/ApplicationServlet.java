package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplicationServlet
 */
@WebServlet("/ApplicationServlet")
public class ApplicationServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String firstName, lastName, Gender, qualification, Languages;
		firstName = request.getParameter("Firstname");
		lastName = request.getParameter("Lastname");
		Gender = request.getParameter("User_Gender");
		qualification = request.getParameter("User_Qual");
		Languages = request.getParameter("Lang");

		String lang[] = request.getParameterValues("Lang");

		out.println("<h1> Details:  </h1>");
		out.println("First Name :" + firstName + "<br>");

		out.println("Last Name :" + lastName + "<br>");
		out.println("Gender :" + Gender + "<br>");
		out.println("Qualification : " + qualification + "<br>");
		out.println("Languages :");
		for (String string : lang) {
			out.println(string);
		}

	}
}
