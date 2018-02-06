package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String language=request.getParameter("language");
		//call validation logic 
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anil_DB","root","root");
			
			PreparedStatement pst=con.prepareStatement("insert into USERDETAILS values(?,?,?,?)");
			                  pst.setString(1, name);
			                  pst.setString(2, password);
			                  pst.setString(3, email);
			                  pst.setString(4, language);
			                  int count=pst.executeUpdate();
			                  if(count>0)
			                  {
			                	out.println("your record successfully updated");
			                  }
			                  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		out.close();
	}


}
