package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * Write a hello world HTML page
	 *
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		writer.println("<!doctype html>");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Hello world</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Hello world</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

}
