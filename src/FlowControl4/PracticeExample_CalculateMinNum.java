package FlowControl4;
import java.util.Scanner;

public class PracticeExample_CalculateMinNum {
    public static void main(String[] args) {

        /* Create a class with a main method where the challenge is to find the smallest number of at least 10 integers. 
        Use the Scanner class to enter the number of numbers to compare, then use a for statement to iterate the entered number of times to request the integer. 
        The following is required:
        - Calculate the smallest number and print the value.
        - If the smallest number is less than 10, print "The smallest number is less than 10!"; otherwise, print "The smallest number is equal to or greater than 10!" */
        

        //Solution:

        // 1. Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // 2. Prompt the user to enter the number of integers to compare.

        System.out.print("Enter the number of integers to compare (at least 10): ");

        // 3. Getting the 10 integers from the user (using for).
        int n = scanner.nextInt(); // Read the number of integers to compare
        
        int minNum = Integer.MAX_VALUE; // Initialize minNum to the maximum possible integer value

        // 4. Check if the number of integers is at least 10.

        if (n < 10) {
            System.out.println("You must enter at least 10 integers.");
        } else {
            // 5. Use a for loop to iterate n times and read the integers.
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter integer " + i + ": ");
                int num = scanner.nextInt(); // Read the integer

                // 6. Compare the entered number with minNum and update minNum if necessary.
                if (num < minNum) {
                    minNum = num; // Update minNum if the current number is smaller
                }
            }

            // 7. Print the smallest number.
            System.out.println("The smallest number is: " + minNum);

            // 8. Check if the smallest number is less than 10 and print the appropriate message.
            if (minNum < 10) {
                System.out.println("The smallest number is less than 10!");
            } else {
                System.out.println("The smallest number is equal to or greater than 10!");
            }
        }
    }
}
