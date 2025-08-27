package FlowControl4;

public class SentenceIfElse {
    public static void main(String[] args) {
        
        // The if-else is common in Java and other programming languages.
        // It is used to execute a block of code based on a condition.
        // The if statement checks the condition, and if it is true, the block of code inside the if statement is executed.
        // If the condition is false, the block of code inside the else statement is executed.
        // The else statement is optional, and you can have multiple else if statements to check for additional conditions.
        // The if-else statement can be nested, meaning you can have an if statement inside another if statement.
        // This allows you to create more complex conditions and control the flow of execution based on multiple criteria.
        // The if-else statement is a fundamental control structure in Java and is widely used in programming to make decisions and control the flow of execution.

        // Examples of if-else statement

        float average = 75.5f;

        if (average >= 70){
            System.out.println("You passed the exam.");
        } else if (average >= 60) {
            System.out.println("You are in the recovery exam.");
        } else {
            System.out.println("You failed the exam.");
        };

        // Nested if-else statements
        int age = 25;
        String citizenship = "USA";
        
        if (age >= 18) {
            if (citizenship.equals("USA")) {
                System.out.println("You are eligible to vote in the USA.");
            } else {
                System.out.println("You are not eligible to vote in the USA.");
            }
        } else {
            System.out.println("You are not old enough to vote.");
        }


    }

}
