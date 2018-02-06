package com.bridgelabz.program;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 RequestDispatcher rd=request.getRequestDispatcher("link.html");
		 rd.include(request, response);
		 String name=request.getParameter("name");
		 String password=request.getParameter("password");
		 if(password.equals("anil123"))
		 {
			  out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name);  
	              
	            Cookie ck=new Cookie("name",name);//add name in cookie
	            response.addCookie(ck);  
	        }
		   else
		   {  
	            out.print("sorry, username or password is wrong please enter valid details!");  
	            request.getRequestDispatcher("login.html");
	            rd.include(request, response);
		   }
		 out.close();
	}

	

}
