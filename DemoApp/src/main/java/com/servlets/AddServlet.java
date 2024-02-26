package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws NumberFormatException, IOException, ServletException {
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
//		 k= k * k;
//		1. res.sendRedirect("sq?k="+k);
//		2. Using session management
//		3. Using cookie
		
		
//		HttpSession session= req.getSession(); 
//		session.setAttribute("k", k);
		
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);	
		res.sendRedirect("sq");
///		 1. way using RequestDispatcher
//		 req.setAttribute("k", k);
//		 RequestDispatcher rd = req.getRequestDispatcher("sq");
//		 rd.forward(req, res);
	}
}
