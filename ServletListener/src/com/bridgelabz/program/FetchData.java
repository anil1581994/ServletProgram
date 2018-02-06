package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

      response.setContentType("text/html");  
      PrintWriter out=response.getWriter();
    
      try {
    	   //get the connection object from servlet context
    	   ServletContext ctx=getServletContext();
    	   Connection connection=(Connection) ctx.getAttribute("mycon");
    	   //retrieve the data from table
    	   PreparedStatement pst=connection.prepareStatement("select * from emp",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE );
    	    ResultSet rs=pst.executeQuery();
    	    while(rs.next())
    	    {
    	    	out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    	    }
    	    connection.close();
         }catch(Exception e)
          {
          	 
           }
        out.close();
	}
}
              
