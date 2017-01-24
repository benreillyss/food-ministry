package org.wof.foodministry;

import java.util.Date;

public class FoodEntry {
	// TODO
    // Research and see if there is a class or a better method for getting
    // exact or automatic day, date, or time information using existing
    // Java classes
    
	Date date;
	int weight;
	int waste;
	String location;

	public FoodEntry( int weight, int waste, String location) {
		this.date = new Date();
		this.weight = weight;
		this.waste = waste;
		this.location = location;
	}
    
    // TODO
    // Create get/set methods for all of the class variables associated with
    // the FoodEntry class
    
    // for example
    
    public int getWeight() {
		return weight;
	 }
	 public void setWeight ( int weight ) {
		   this.weight = weight;
	 }
	 public Date getDate() {
		 return this.date;
	 }
	 public void setDate (Date date) {
		 this.date = date;
	 }
	 public String getLocation() {
		 return location;
	 }
	 public void setLocation(String location) {
		 this.location = location;
	 }
	 public int getWaste() {
		 return waste;
	 }
	 public void setWaste(int waste) {
		 this.waste = waste;
	 }    
	 public void generateDailyReport(){
			System.out.println(date.toString());
			System.out.println("The Location of Pickup is: " + this.location);
			System.out.println("Load weight of  Pickup is: " + this.weight);
			System.out.println("Waste after the pickup: " + this.waste);

     };
    
    
}
