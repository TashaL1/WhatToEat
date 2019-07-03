import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String eventType = "casual";
		int partySize = 1;
		String result = eventType + partySize;

		System.out.println("What type of event are you having? ");

		eventType = scnr.next();

		if (eventType.equals("casual")) {
			result = "sandwiches";
		} else if (eventType.equals("semi-formal")) {
			result = "fried chicken";
		} else if (eventType.contentEquals("formal")) {
			result = "chicken parmesan";

		}

		System.out.println("What's the size of your party? ");
		partySize = scnr.nextInt();

		if (partySize == 1) {
			result = "in the microwave.";
		} else if (partySize == 2 && partySize <= 12) {
			result = ("in your kitchen.");
		} else if (partySize == 13 && partySize > 13) {
			result = ("by the caterer.");

		}

		System.out.print("Since you're hosting a " + eventType + " event ");
		System.out.print("for " + partySize + " participants, you should serve " + result);
	}

	// scnr.close(); }
}