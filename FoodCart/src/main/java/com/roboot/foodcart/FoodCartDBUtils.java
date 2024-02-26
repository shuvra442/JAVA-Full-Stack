package com.roboot.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtils {
	
	String url =""; // set url
	String userName=""; // set user name
	String password= "";// set passwrod
	
    public static = List<Food> getFoodList() throws ClassNotFoundException, SQLException{
    	ArrayList<Food> food = new ArrayList<>();
    	
    	//Load the driver
    	Class.forName("com.mySql.jdbc.Driver");
    	
    	
        // get the connection
			Connection con= DriverManager.getConnection(url,userName,password);
    	
    	// create the statement
    	    Statement stmt =con.createStatement();
    	    
    	
    	//execute the statement
    	
    	ResultSet rs = stmt.executeQuery("select * from food");
    	
    	while(rs.next()) {
    		int id = rs.getInt(1);
    	    String foodName = rs.getString(2);
    	    String food_price = rs.getString(3);
    	    Food f =new Food(id, foodName,food_price);
    	    food.add(f);
    	}
    	return food;
    }
}
