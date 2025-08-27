package FlowControl4;

public class SentenceSwitch {
    public static void main(String[] args) {
        
        // The switch statement is a control structure in Java that allows you to execute different blocks of code based on the value of a variable or expression.
        // It is often used as an alternative to multiple if-else statements when you have a large number of conditions to check.
        // The switch statement evaluates the expression and compares its value to the values specified in each case label.
        // When a match is found, the corresponding block of code is executed.
        // The break statement is used to exit the switch statement after executing the matching case block.
        // Supports integer, char, String, and enum types.

        // Example of switch statement
        int day = 3;
        String dayName; 
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("The day is: " + dayName);
    }
}
