package com.bridgelabz.program;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException
    {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{

	    PrintWriter out=response.getWriter();  
	          
	    String password=request.getParameter("password");  
	    if(password.equals("bridglabz"))
	    {  
	    chain.doFilter(request, response);//sends request to next resource &filtering logic
	    }  
	    else
	    {  
	    out.print("username or password invalid try once again");  
	    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	    rd.include(request, response);  
	    }  
        
		
	}

	public void destroy() {

	}

}
