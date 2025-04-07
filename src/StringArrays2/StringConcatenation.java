package StringArrays2;

public class StringConcatenation {
    public static void main(String[] args) {
        
        //Way 1: Using the + operator
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // Concatenating strings with a space in between
        System.out.println("Full Name: " + fullName); // Output: Full Name: John Doe

        //Way 2: Using the concat() method
        String greeting = "Hello, ";
        String message = greeting.concat(fullName); // Concatenating strings using concat() method
        System.out.println("Greeting Message: " + message); // Output: Greeting Message: Hello, John Doe

        //If i'm trying to concatenate a string with a number, it will be converted to string automatically.
        int age = 30;
        String ageMessage = "Age: " + age; // Concatenating string with an integer
        System.out.println(ageMessage); // Output: Age: 30

        //If i'm summing two numbers in a linea and the first one is a string, it will be converted to string automatically.
        String number1 = "10";
        String number2 = "20";
        System.out.println("number" + number1 + number2); // Output: number1020
        //It happens because the precedence of the + operator is from left to right, so it will be converted to string and then concatenated.
        //Here it is why the importance of the parenthesis.
        System.out.println("number" + (number1 + number2)); // Output: number30

        //In terms of performance which is better?
        //The + operator is more readable and easier to use for simple concatenation, while StringBuilder is more efficient for complex concatenation operations.
        //For example, if you are concatenating a large number of strings in a loop, using StringBuilder is more efficient than using the + operator.
        //Between concat() and + operator, the + operator is generally preferred for its simplicity and readability.
        //Between apend() has a better performance than concat() and + operator, but it is less readable and more complex to use.
        //So, if you are concatenating a small number of strings, use the + operator. If you are concatenating a large number of strings, use StringBuilder.
    }
}
