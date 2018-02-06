package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadContextParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String str="";
		ServletConfig config=getServletConfig();
		ServletContext context=config.getServletContext();
		Enumeration<String> e=context.getInitParameterNames();
		while(e.hasMoreElements())
		{
			str=e.nextElement();
			out.println("<br>"+context.getInitParameter(str));
		}
		out.close();
	}

	

}
