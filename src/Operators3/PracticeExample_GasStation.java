package Operators3;

public class PracticeExample_GasStation {
    public static void main(String[] args) {
        
        /* Assuming a 70-liter gas tank, a program is required that requests the current measurement in liters and displays the result as follows: Insufficient, Sufficient, Medium...

            - The current tank measurement or capacity can be in double format for greater accuracy, but it can also be int format.

            - If the current capacity is 70 liters: print "Tank Full"

            - If it is between 60 and less than 70: print "Tank Almost Full"

            - If it is between 40 and less than 60: print "Tank 3/4 Full"

            - If it is between 35 and less than 40: print "Medium Tank"

            - If it is between 20 and less than 35: print "Sufficient"

            - If it is between 1 and less than 20: print "Insufficient"
        */

        //Solution
        double tankCapacity = 70.0; // Maximum capacity of the tank in liters
        double currentMeasurement = 0.0; // Current measurement in liters

        // Assuming the user inputs the current measurement
        // For example, let's say the user inputs 50.0 liters
        currentMeasurement = 50.0; // This can be changed to test different values

        // Check the current measurement and print the appropriate message
        if (currentMeasurement == tankCapacity) {
            System.out.println("Tank Full");
        } else if (currentMeasurement >= 60 && currentMeasurement < tankCapacity) {
            System.out.println("Tank Almost Full");
        } else if (currentMeasurement >= 40 && currentMeasurement < 60) {
            System.out.println("Tank 3/4 Full");
        } else if (currentMeasurement >= 35 && currentMeasurement < 40) {
            System.out.println("Medium Tank");
        } else if (currentMeasurement >= 20 && currentMeasurement < 35) {
            System.out.println("Sufficient");
        } else if (currentMeasurement > 0 && currentMeasurement < 20) {
            System.out.println("Insufficient");
        } else {
            System.out.println("Invalid measurement. Please enter a value between 0 and " + tankCapacity + " liters.");
        }
        // Note: The current measurement can be changed to test different scenarios.
        // For example, you can set currentMeasurement = 15.0 to test the "Insufficient" case.
        // You can also set currentMeasurement = 75.0 to test the "Invalid measurement" case.
        // The program will print the appropriate message based on the current measurement.
        // You can also use a Scanner to get user input for the current measurement.
        

    }

}
