package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String food;
	private double rating;
	private int id;
	


	public static int truckNum = 0;
	
	public FoodTruck() {}
	public FoodTruck(String name, String food, double rating) {
		this.name = name;
		this.food = food;
		this.rating = rating;
		if (rating > 10) {
			rating %= 10;
		}
		this.id = truckNum + 1;
		truckNum++;
		
		
		
	}
	
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public String getFood() {
		return food;
	}
	public int getId() {
		return id;
	}
	
	public double calculateAverage(FoodTruck [] fleet) {
		double total = 0;
		for(int i = 0; i < fleet.length; i++ ) {
			total += fleet[i].rating;
		}
		double average = (Math.round(total/truckNum)*10.0)/10.0;
		return average;
	}
	
	
	public String highestRating(FoodTruck[] fleet) {
		double highest = 0;
		int highestI = 0;
		for( int i  = 0; i < fleet.length; i ++) {
			if ( fleet[i].getRating() > highest) {
				highest = fleet[i].getRating();
				highestI = i;
			}
		}
		return fleet[highestI].getName();
	}
	
	
	public void toString(FoodTruck[] fleet) {
		
		for(int i = 0; i < fleet.length; i ++) {
			if (fleet[i] == null) {
				break;
			}
			System.out.println("ID # "+ fleet[i].getId() +  ") " + fleet[i].getName() + " is selling " + fleet[i].getFood() + " and is rated: " + fleet[i].getRating()+ ".");
		}
		
	}
	
}
