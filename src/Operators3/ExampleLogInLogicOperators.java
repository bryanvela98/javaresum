package Operators3;
import java.util.Scanner;

public class ExampleLogInLogicOperators {
    public static void main(String[] args) {
        
        // Setting up a simple login system using logical operators
        // This example demonstrates the use of logical operators (AND, OR, NOT) in a real-world scenario.
        String username = "admin";
        String password = "1234";

        // Simulating user input, scanner is used to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting user for username and password
        System.out.println("Enter username: ");
        String inputUsername = scanner.next();

        System.out.println("Enter password: ");
        String inputPassword = scanner.next();

        boolean isAuthenticated = false;
        
        // Using logical AND operator to check if both username and password are correct
        if (username.equals(inputUsername) && password.equals(inputPassword)){
            isAuthenticated = true;
        }

        if (isAuthenticated) {
            System.out.println("Login successful!"+" Welcome " + username + ".");
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
    }
}
