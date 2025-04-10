package FlowControl4;

public class SentenceDoWhile {
    public static void main(String[] args) {
        
        // Do While loop

        // Example 1: Basic do-while loop
        int k = 0; // Initialize counter
        do {
            // Block of code to execute
            System.out.println("Iteration: " + k);
            k++; // Increment the counter
        } while (k < 5); // Condition to check

        // Example 2: Nested do-while loop
        int i = 0; // Outer loop counter
        do { // Outer loop condition
            int j = 0; // Inner loop counter
            do { // Inner loop condition
                // Block of code to execute
                System.out.println("Outer loop: " + i + ", Inner loop: " + j);
                j++; // Increment the inner loop counter
            } while (j < 2); // Inner loop condition
            i++; // Increment the outer loop counter
        } while (i < 3); // Outer loop condition

        // Example 3: Using break statement to exit loop
        int m = 0; // Initialize counter
        do { // Condition to check
            // Block of code to execute
            if (m == 3) {
                break; // Exit the loop when m is 3
            }
            System.out.println("Iteration: " + m);
            m++; // Increment the counter
        } while (m < 5); // Condition to check

        // Example 4: Using continue statement to skip an iteration
        int n = 0; // Initialize counter
        do { // Condition to check
            // Block of code to execute
            if (n == 2) {
                n++; // Increment the counter before continue to avoid infinite loop
                continue; // Skip the iteration when n is 2
            }
            System.out.println("Iteration: " + n);
            n++; // Increment the counter
        } while (n < 5); // Condition to check
    }

}
