package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws NumberFormatException, IOException {
		
//		1. url reWriting example
//		int k =Integer.parseInt(req.getParameter("k"));
//		2. Now the same thing can do using session management
//		HttpSession session= req.getSession();
//		int k= (int)session.getAttribute("k");
//		 3. using cookie
		int k = 0;
		Cookie cookie[] = req.getCookies();
		
		for(Cookie c: cookie) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
			
		}
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is k " + k);
		System.out.println("sq called");
	}
}
