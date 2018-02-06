package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("userName");
		out.print("<html");
		out.print("<form='servlet2'>");
		out.print("<input type='hidden' name='uname' value='"+name+"'>");//hide data in hidden form
		out.print("</form>");
		out.print("</html");
		out.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}


}
