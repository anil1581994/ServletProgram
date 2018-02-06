package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		context.setAttribute("companyName","BridgelabzIT");//set attribute in appln scope
		out.println("this is from servlet-->1");
		out.println("<a href='servlet2'>click here to share object to second servlet</a>");
		out.close();
		}catch(Exception e)
		{
			System.out.println("close your resources");
		}
	}

	

}
