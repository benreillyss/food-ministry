package org.wof.foodministry;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.wof.foodministry.FoodEntry; 

public class FoodMinistryConsoleApp {

	public static void main(String[] args) {
		// TODO
		// Implement the following methods for your program
		showAppInfo();
		FoodEntry foodEntry = createFoodEntry();
		foodEntry.generateDailyReport();
		writeLogEntry(foodEntry);
		//sendEmailReport();
	}
	
	public static void showAppInfo(){
		// Display a meaninful, well formated console output that describes
		// What this application does and show a sample output of what it 
		// produces
		System.out.println("Way Of Faith Food Ministry Entry App");
		System.out.println("Please provide the following information");
	}

	public static FoodEntry createFoodEntry(){
		// Ask the user for the necessary information needed to create an 
		// instance of the FoodEntry class. Then fill inthe constructor
		// for the FoodEntry class object below.
		Scanner sc = new Scanner(System.in);
		System.out.println("Pickup location ?");
		String location = sc.next();
		System.out.println("How much does the load weigh? in pounds");
		int weight = sc.nextInt();
		System.out.println("What was the total waste after pickup");
		int waste = sc.nextInt();
		FoodEntry fe = new FoodEntry(weight, waste, location);
		return fe;
	}

	public static void writeLogEntry(FoodEntry fe){
		// Create or write to a log folder that is in the same folder as
		// your command line application. Write a txt or csv file with the
		// information you received from the user
		try {
			String outputFile = "test.csv";
			FileWriter writer = new FileWriter(outputFile);
			writer.append("load weight in pounds: " + fe.weight);
			writer.append(',');
			writer.append('\n');
			writer.append("The Date of Pickup was: " + fe.date);
			writer.append(',');       	
			writer.append('\n');
		    writer.append("The Location of pickup was: " + fe.location);
	        writer.append(',');       	
			writer.append('\n');
			writer.flush();
			writer.close();
			System.out.println(" Wrote log file ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendEmailReport(FoodEntry fe){
		// Try to send an email with the results of the day to yourself
		// See if you can get this to work
		// https://developers.google.com/gmail/api/guides/sending
		System.out.println("this will be tuff, but fun!");
	}
}
