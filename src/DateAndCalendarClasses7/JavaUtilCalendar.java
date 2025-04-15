package DateAndCalendarClasses7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar; // Importing Calendar Class
import java.util.Date;
import java.text.SimpleDateFormat;

public class JavaUtilCalendar {

    public static void main(String[] args) {
        
        // Calendar class is used to represent a specific date and time, with various fields like year, month, day, hour, minute, second, etc.
        // It is an abstract class, and you typically use its subclasses like GregorianCalendar to create instances.

        // Example of use

        Calendar calendar = Calendar.getInstance(); // Getting the current date and time
        calendar.set(2025, 12, 4);

        Date date = calendar.getTime(); // Getting the Date object from the Calendar instance
        System.out.println("Current date and time: " + date);

        // Other way to set calendar date and time
        calendar.set(Calendar.YEAR, 2025); // Setting the year
        calendar.set(Calendar.MONTH, Calendar.DECEMBER); // Setting the month (0-based index)
        calendar.set(Calendar.DAY_OF_MONTH, 4); // Setting the day of the month
        calendar.set(Calendar.HOUR_OF_DAY, 10); // Setting the hour of the day (24-hour format)
        calendar.set(Calendar.MINUTE, 30); // Setting the minute
        calendar.set(Calendar.SECOND, 0); // Setting the second


        // Converting a String Dato to a Date object
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Date format pattern
        try {
            Date newDate = format.parse("14/04/2025"); // Parsing(Converting) the string to a Date object
            System.out.println("Parsed date: " + newDate); ;
            System.out.println("format = " + format.format(newDate)); // Formatting the date to a specific pattern

            // Comparing with another date
            Date anotherDate = new Date(); // Current date and time

            if (newDate.after(anotherDate)) { // Checking if newDate is after anotherDate
                System.out.println("newDate is after anotherDate");
            } else if (newDate.before(anotherDate)) { // Checking if newDate is before anotherDate
                System.out.println("newDate is before anotherDate");
            } else {
                System.out.println("newDate is equal to anotherDate");
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } //

        // Getting the time in milliseconds since epoch (January 1, 1970)
    }
}
