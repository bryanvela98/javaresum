package MathClass9;
import java.util.Random; // Importing the Random class

public class RandomFunction {
    public static void main(String[] args) {
        
        // The Random function is a method in the Math class that generates a pseudo-random double value between 0.0 (inclusive) and 1.0 (exclusive).

        double randomValue = Math.random(); // Generating a random value
        System.out.println("Random value between 0.0 and 1.0: " + randomValue); // Output: Random value between 0.0 and 1.0

        // Using random class to generate random numbers in a range
        Random randomObj = new Random(); // Creating an instance of the Random class
        int randomInt = randomObj.nextInt(100); // Generating a random integer between 0 and 99
        System.out.println("Random integer between 0 and 99: " + randomInt); // Output: Random integer between 0 and 99

        long randomLong = randomObj.nextLong(); // Generating a random long value
        System.out.println("Random long value: " + randomLong); // Output: Random long value
    }

}
