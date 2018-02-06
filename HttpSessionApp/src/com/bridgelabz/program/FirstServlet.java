package com.bridgelabz.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");

		out.print("welcome to servlet-1:--->" + name);
		out.println(".............................");
		HttpSession session = request.getSession();
		session.setAttribute("uname", name);
		out.print("<a href='servlet2'>visit to second servlet</a>");
		out.close();

	}

}
