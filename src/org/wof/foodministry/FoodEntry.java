package org.wof.foodministry;

public class FoodEntry {
	String day;
	String time;
	int weight;
	int waste;
	
	FoodEntry(String day, String time, int weight, int waste) {
		this.day = day;
		this.time = time;
		this.weight = weight;
		this.waste = waste;
	}
}
