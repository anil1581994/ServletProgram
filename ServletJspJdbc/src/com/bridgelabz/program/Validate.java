package com.bridgelabz.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Validate {
	public static boolean checkUser(String email,String password) 
    {
     boolean st =false;
     Connection con=null;
     Statement stmt=null;
     try{

	 //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	 //creating connection with the database 
         con=DriverManager.getConnection
                       ("jdbc:mysql://localhost:3306/anil_DB","root","root");
        PreparedStatement ps =con.prepareStatement
                            ("select * from USERDETAILS where email=? and password=?");
        ps.setString(1,email);
        ps.setString(2,password);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
     }catch(Exception e)
     {
    	 System.out.println(e);
     }
       
       return st;
     }
 }   

