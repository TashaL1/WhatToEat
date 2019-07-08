import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String eventType = "casual";
		int partySize = 1;
		String mealSuggestion = ("sandwiches ");
		String prepSuggestion = ("in your kitchen.");
		String result = mealSuggestion;

		System.out.println("What type of event are you having? ");

		eventType = scnr.next();

		if (eventType.equals("casual")) {
			mealSuggestion = "sandwiches ";
		} else if (eventType.equals("semi-formal")) {
			mealSuggestion = "fried chicken ";
		} else if (eventType.contentEquals("formal")) {
			mealSuggestion = "chicken parmesan ";

		}

		System.out.println("What's the size of your party? ");

		partySize = scnr.nextInt();

		if (partySize == 1) {
			prepSuggestion = "in the microwave.";
		} else if (partySize == 2 && partySize <= 12) {
			prepSuggestion = ("in your kitchen.");
		} else if (partySize >= 13) {
			prepSuggestion = ("by a caterer.");

		}

		result = mealSuggestion + "prepared " + prepSuggestion;

		System.out.print("Since you're hosting a " + eventType + " event ");
		System.out.print("for " + partySize + " participants, you should serve " + result);
	}

}