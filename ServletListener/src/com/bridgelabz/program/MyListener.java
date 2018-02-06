package com.bridgelabz.program;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anil_DB", "root", "root");

			// storing connection object as an attribute in ServletContext
			ServletContext ctx = event.getServletContext();
			ctx.setAttribute("mycon", con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}

}
