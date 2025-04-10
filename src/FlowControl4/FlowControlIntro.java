package FlowControl4;

public class FlowControlIntro {
    public static void main(String[] args) {
        
        /* Flow control is used to control the order in which statements are executed in a program.
         * It allows you to make decisions, repeat actions, and control the flow of execution based on certain conditions.
        */

        // if-else statement: Used to execute a block of code based on a condition.
        // Condition Expression could be boolean, int, char, etc.
        // If the condition is true, the block of code inside the if statement is executed.
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // switch statement: Used to execute one block of code among many based on the value of a variable.
        // Condition Expression could be int, char, String, etc.
        // The switch statement evaluates the expression and executes the case that matches the value of the expression.
        // If no case matches, the default case is executed if it is present.
        // Break statement: Used to exit a loop or switch statement.
        int colors = 3;
        switch (colors) {
            case 1:
                System.out.println("Red");
                break;  
            case 2:
                System.out.println("Green");
                break;
            case 3:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Unknown color");
        }
        

        // Separators: Used to separate different parts of a program or code block.
        // For example, semicolons (;) are used to separate statements in Java.
        // Curly braces ({}) are used to define the beginning and end of a block of code.
        // Parentheses (()) are used to group expressions and define the order of operations.
        // Brackets ([]) are used to define arrays and access array elements.
        // Commas (,) are used to separate items in a list or parameters in a method call.
        // For example, in a method call, you can pass multiple arguments separated by commas.
        // In a for loop, you can use commas to separate the initialization, condition, and increment/decrement expressions.
        // In a switch statement, you can use commas to separate multiple case labels.

    }

}
