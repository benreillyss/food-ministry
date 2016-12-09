package org.wof.foodministry;

public class FoodEntry {
	// TODO
    // Research and see if there is a class or a better method for getting
    // exact or automatic day, date, or time information using existing
    // Java classes
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
    
    // TODO
    // Create get/set methods for all of the class variables associated with
    // the FoodEntry class
    
    // for example
    public String getDay() {
        return name;
    }
    
    public void setDay ( String day ) {
        this.day = day;
    } 
}
