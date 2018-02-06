package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Genricservlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");  
		out.print("<b>this response is from generic servlet</b>");  
		out.print("</body></html>");  
	}

}
