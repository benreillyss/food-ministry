package org.wof.foodministry;
import org.wof.foodministry.FoodEntry; 

public class FoodMinistryConsoleApp {

	public static void main(String[] args) {
		// TODO
		// Implement the following methods for your program
		showAppInfo();
		createFoodEntry();
		writeLogEntry();
		sendEmailReport();
	}
	
	public static void showAppInfo(){
		// Display a meaninful, well formated console output that describes
		// What this application does and show a sample output of what it 
		// produces
	}

	public static FoodEntry createFoodEntry(){
		// Ask the user for the necessary information needed to create an 
		// instance of the FoodEntry class. Then fill inthe constructor
		// for the FoodEntry class object below.
		FoodEntry fe = new FoodEntry();
		return fe;
	}

	public static void writeLogEntry(){
		// Create or write to a log folder that is in the same folder as
		// your command line application. Write a txt or csv file with the
		// information you received from the user
	}

	public static void sendEmailReport(FoodEntry fe){
		// Try to send an email with the results of the day to yourself
		// See if you can get this to work
		// https://developers.google.com/gmail/api/guides/sending
		System.out.println("this will be tuff, but fun!");
	}
}
