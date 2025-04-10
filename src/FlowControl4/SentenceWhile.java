package FlowControl4;

public class SentenceWhile {
    public static void main(String[] args) {
        
        // While loop
        
        // Example 1: Basic while loop
        
        int j = 0; // Initialize counter
        while (j < 5) { // Condition to check
            // Block of code to execute
            System.out.println("Iteration: " + j);
            j++; // Increment the counter to avoid infinite loop
        }

        // Example 2: Nested while loop

        int i = 0; // Outer loop counter
        while (i < 3) { // Outer loop condition
            int k = 0; // Inner loop counter
            while (k < 2) { // Inner loop condition
                // Block of code to execute
                System.out.println("Outer loop: " + i + ", Inner loop: " + k);
                k++; // Increment the inner loop counter
            }
            i++; // Increment the outer loop counter
        }

        // Example 3: Using break statement to exit loop
        int m = 0; // Initialize counter
        while (m < 5) { // Condition to check
            // Block of code to execute
            if (m == 3) {
                break; // Exit the loop when m is 3
            }
            System.out.println("Iteration: " + m);
            m++; // Increment the counter
        }

        // Example 4: Using continue statement to skip an iteration
        int n = 0; // Initialize counter
        while (n < 5) { // Condition to check
            // Block of code to execute
            if (n == 2) {
                n++; // Increment the counter before continue to avoid infinite loop
                continue; // Skip the iteration when n is 2
            }
            System.out.println("Iteration: " + n);
            n++; // Increment the counter
        }

    }

}
