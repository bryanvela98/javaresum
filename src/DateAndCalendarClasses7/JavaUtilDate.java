package DateAndCalendarClasses7;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        
        // Date class is used to represent a specific instant in time, with millisecond precision.
        // It is part of the java.util package and is often used for date and time manipulation.
        // The Date class has been largely replaced by the java.time package in Java 8 and later,

        // Example of creating a Date objetc

        Date date = new Date(); // Current date and time

        System.out.println("Current date and time: " + date);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy"); // Date format pattern
        String fechaStr = df.format(date); // Formatting the date to a specific pattern

        // Printing the formatted date
        System.out.println("Formatted date: " + fechaStr);

        // Time in Miliseconds of getTime() method
        long timeInMillis = date.getTime(); // Getting the time in milliseconds since epoch (January 1, 1970)
        System.out.println("Time in milliseconds since epoch: " + timeInMillis);
    }

}
