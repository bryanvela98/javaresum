package FlowControl4;

public class SentenceFor {
    public static void main(String[] args) {
        
        // Example 1: Basic for loop
        for (int i = 0; i < 5; i++) { // Initialization; Condition; Increment
            System.out.println("Iteration: " + i); // Block of code to execute
        }

        // Example 2: Nested for loop
        for (int i = 0; i < 3; i++) { // Outer loop
            for (int j = 0; j < 2; j++) {   // Inner loop
                // Block of code to execute
                System.out.println("Outer loop: " + i + ", Inner loop: " + j);
            }
        }

        // Example 3: Enhanced for loop (for-each loop)
        String[] fruits = {"Apple", "Banana", "Cherry"}; // Array of fruits
        for (String fruit : fruits) { // Enhanced for loop
            // Block of code to execute for each element in the array
            System.out.println("Fruit: " + fruit);
        }

        // Example 4: Using break statement to exit loop
        for (int i = 0; i < 5; i++) { // Initialization; Condition; Increment
            // Block of code to execute
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("Iteration: " + i);
        }

        // Example 5: Using continue statement to skip an iteration
        for (int i = 0; i < 5; i++) { // Initialization; Condition; Increment
            // Block of code to execute
            if (i == 2) {
                continue; // Skip the iteration when i is 2
            }
            System.out.println("Iteration: " + i);
        }

    }

}
