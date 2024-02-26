package com.roboot.foodcart;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		get the data from the database(model)
	      try {
			List<Food>foodItem=FoodCartDBUtils.getFoodList();
			request.setAttribute("foodItem", foodItem);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
//		redirect to a different page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-view.jsp");
		dispatcher.forward(request, response);
	}

}
