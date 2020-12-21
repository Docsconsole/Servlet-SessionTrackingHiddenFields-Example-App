package com.docsconsole.tutorials;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class HomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userName = request.getParameter("userName");

			// wiil be created hidden field in the html page

			out.print("<div style='padding-left: 50px; padding-top: 50px;'>");
			out.print("<span style='color: #00bcd4;'>Welcome:</span>" + userName);
			out.print("<form action='sendCookiesServlet'>");
			out.print("<input type='hidden' name='userName' value='" + userName
					+ "'><input type='submit' value='Send Hidden Field' style='margin-top: 10px;background: #8083ef;'>");
			out.print("</form></div>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}