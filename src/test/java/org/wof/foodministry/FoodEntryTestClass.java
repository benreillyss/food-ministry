package org.wof.foodministry;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* tests folder, imports, and initial test were all set up for an Intellij IDE
   http://stackoverflow.com/questions/19330832/setting-up-junit-with-intellij-idea
 */
public class FoodEntryTestClass {

    // Creating a sample Date object with the same data for each test requires
    // making the data object with defined, repeatable values.
    // http://stackoverflow.com/questions/22326339/how-create-date-object-with-values-in-java
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dateString = "2017-01-01 00:00:00";
    Date date = sdf.parse(dateString);

    // Simple variable types can be defined
    int weight = 100;
    int waste = 25;
    String location = "Fairfax";

    FoodEntry entry = new FoodEntry(weight, waste, location);

    public FoodEntryTestClass() throws ParseException {
    }

    @Test
    public void testGetWeightTrue(){
        System.out.println("Testing getWeight() for true");
        int result = entry.getWeight();
        assertEquals(100, result);
    }

    @Test
    public void testGetWeightFalse() {
        System.out.println("Testing getWeight() for false");
        int result = entry.getWeight();
        assertNotEquals(10, result);
    }
    //TODO: Create true and false test cases for the other FoodEntry class variables
    //      Follow the pattern show for the getWeight() method

    //TODO: Look into other unit test types to get complete testing coverage on your class

    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }
}
