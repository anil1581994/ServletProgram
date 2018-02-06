package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//getting the value form hidden form field
		String n=request.getParameter("uname");
		out.println("wecome your hidden form data is -->:"+n);
		out.close();
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
