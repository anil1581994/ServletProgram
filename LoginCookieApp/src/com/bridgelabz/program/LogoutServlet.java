package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("link.html");
		rd.include(request, response);
		Cookie ck=new Cookie("name","");//to delete the cookied data
		ck.setMaxAge(0);//change the max age 0 seconds
		response.addCookie(ck);//add the response in cookie
		out.println("you are successfully logout");
		
	}

	

}
