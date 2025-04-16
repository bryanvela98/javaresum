package SystemClass8;
import java.util.Properties;
import java.io.FileInputStream; // Importing FileInputStream

public class SystemClassIntro {
    public static void main(String[] args) {
        /*
         * The System class is a final class in Java that provides access to system-level resources and operations.
         * It contains static methods and fields that allow you to interact with the Java runtime environment.
         * Some of the key features of the System class include:
         * 1. Standard Input/Output: The System class provides access to standard input (System.in), output (System.out), and error (System.err) streams.
         * 2. Environment Variables: You can retrieve environment variables using System.getenv() method.
         * 3. System Properties: You can access system properties using System.getProperty() method.
         * 4. Current Time: You can get the current time in milliseconds since the epoch using System.currentTimeMillis().
         * 5. Exit: You can terminate the Java program using System.exit(int status).
         * reference: https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
         */
        // Example of using System class methods

        // Getting current time in milliseconds since epoch
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time in milliseconds since epoch: " + currentTimeMillis);

        // Getting system properties
        String osName = System.getProperty("os.name"); // Getting the operating system name
        System.out.println("Operating System: " + osName);

        String javaVersion = System.getProperty("java.version"); // Getting the Java version
        System.out.println("Java Version: " + javaVersion);

        String userName = System.getProperty("user.name"); // Getting the username
        System.out.println("User Name: " + userName);

        String workspace = System.getProperty("user.dir"); // Getting the current working dir
        System.out.println("Current working directory: " + workspace);

        String lineSeparator = System.getProperty("line.separator"); // Getting the line separator
        // or
        String lineSeparator2 = System.lineSeparator(); // Getting the line separator (Java 7+)
        System.out.println("Line Separator: " + lineSeparator + "New Line");

        // Listing System Properties

        Properties properties = System.getProperties(); // Getting all system properties
        properties.list(System.out); // Printing all system properties to the console

        
        // Adding  and customizing system properties and configurations
        try {
            FileInputStream file = new FileInputStream("config.properties"); // FileInputStream to read properties file

            Properties prop = new Properties(System.getProperties()); // Creating a Properties object with system properties
            prop.load(file); // Loading properties from the file
            
        } catch (Exception e) {
            System.out.println("Error reading properties file: " + e.getMessage()); // Handling exception if file not found
        }
    }

}
