package com.docsconsole.tutorials;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class CookiesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			// Getting the value from the hidden field
			String userName = request.getParameter("userName");
			out.print("<div style='padding-left: 50px; padding-top: 50px;'><span style='color: #00bcd4;'>Hello:</span>"
					+ userName + "</div>");

			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}