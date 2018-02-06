package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Login extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		request.getParameterNames();
		 if(password.equals("java"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("srv2");
			rd.forward(request, response);
		}else
		{
			out.print("sorry your credentials are invalid please try valid one");
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
	}

}
