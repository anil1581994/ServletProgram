package com.bridgeit.program;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("userName");
		out.println("welcome to servlet-1==>"+user);

	    Cookie ck=new Cookie("uname",user);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	    //creating submit button in servlet-1 or provide link  
	    out.print("<form action='servlet2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  

	}

	

}
