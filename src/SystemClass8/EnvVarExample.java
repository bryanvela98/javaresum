package SystemClass8;

import java.util.Map;

public class EnvVarExample {
    public static void main(String[] args) {
        
        Map<String, String> env = System.getenv(); // Getting all environment variables
        System.out.println("Environment Variables: " + env); // Printing all environment variables to the console

        // Some examples of environment variables
        String path = System.getenv("PATH"); // Getting the PATH environment variable
        System.out.println("PATH: " + path); // Printing the PATH environment variable

        String userHome = System.getenv("USER_HOME"); // Getting the USER_HOME environment variable
        System.out.println("USER_HOME: " + userHome); // Printing the USER_HOME environment variable

        String username = System.getenv("USERNAME"); // Getting the USERNAME environment variable
        System.out.println("USERNAME: " + username); // Printing the USERNAME environment variable
    }

}
