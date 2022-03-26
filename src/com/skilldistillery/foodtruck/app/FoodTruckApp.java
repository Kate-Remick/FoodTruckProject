package com.skilldistillery.foodtruck.app;
import com.skilldistillery.foodtruck.entities.*;
import java.util.Scanner;

public class FoodTruckApp {
	public FoodTruckApp() {}

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to RATE THE TRUCK, where you can rate 5 food trucks of your choice!\n");
		FoodTruckApp fta = new FoodTruckApp();
		FoodTruck[] fleet = fta.userEntries();
		if( fleet[0] == null) {
			System.out.println("No food trucks have been rated. Have a nice day!");
		}else {
			fta.reviewMenu(fta, fleet);
			
		}
		
		
	}
	
	
	public FoodTruck[] userEntries() {
		Scanner kb = new Scanner(System.in);
		FoodTruck[] fleet = new FoodTruck[5];
		String nameQ = "What is the name of the food truck you are rating?\n";
		String name = "";
		String foodQ = "What is the food that they serve?";
		String food = "";
		String ratingQ= "What (out of ten) do you rate the food truck?";
		double rating = 0.0;
		String[] prompts = {nameQ, foodQ, ratingQ};
		String userInput = ""; 
		
		
		for( int i = 0; i < 5; i++) {
			System.out.println("Let's rate a truck! Type in 'quit' to stop rating.");
			for( int q = 0; q < prompts.length; q ++) {
				System.out.println(prompts[q]);
				userInput = kb.nextLine();
				if (userInput.equalsIgnoreCase("quit")) {
					i = 4;
					break;
				}
				switch(q){
				case 0: 
					name = userInput;
					break;
				case 1:
					food = userInput;
					break;
				case 2:
					rating = Double.parseDouble(userInput);
					break;
				}
			}
			fleet[i] = new FoodTruck(name, food, rating);
		}
		
		return fleet;
		
	}
	private void displayMenu() {
		System.out.println("Would you like to...");
		System.out.println("1) Look at your list of existing food trucks.");
		System.out.println("2) See the average rating of the food trucks.");
		System.out.println("3) View the highest rated food truck.");
		System.out.println("4) Exit");
	}
	
	public void reviewMenu(FoodTruckApp fta, FoodTruck[]  fleet) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Wow! those were some pretty trucklike Food Trucks!");
		int userInput = 0;
		do{
			fta.displayMenu();
			userInput = kb.nextInt();
			switch(userInput) {
			case 1:
				fleet[0].toString(fleet);
				break;
			case 2:
				System.out.println("The fleet average is: "+ fleet[0].calculateAverage(fleet) ) ;
				break;
			case 3:
				System.out.println("The food truck with the hightest rating is..." + fleet[0].highestRating(fleet) + "!");
				break;
			case 4:
				System.out.println("Thank you for your input! Goodbye.");
				break;
			default:
				System.out.println("That input is not recognized, please enter a number (1-4)");
				
			}
		}while(userInput !=4);
		
		
	}
}
