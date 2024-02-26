package com.roboot.foodcart;

public class Food {
	private int id;
	private String foodName;
	private String food_price;
	
	
	public Food(int id, String foodName, String food_price) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.food_price = food_price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public String getFood_price() {
		return food_price;
	}


	public void setFood_price(String food_price) {
		this.food_price = food_price;
	}
	
	
}
