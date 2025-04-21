package SystemClass8;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) {
        
        // Runtime class is a subclass of the Object class and is used to interact with the Java runtime environment.
        // It provides methods to execute system commands, manage memory, and perform other system-level operations.
        // Some of the key features of the Runtime class include:
        // 1. Memory Management: You can get the total and free memory in the Java Virtual Machine (JVM) using Runtime.getTotalMemory() and Runtime.getFreeMemory() methods.
        // 2. Process Management: You can execute system commands and manage processes using Runtime.exec() method.
        // 3. Garbage Collection: You can request garbage collection using Runtime.gc() method.
        // 4. Shutdown Hooks: You can add shutdown hooks to perform cleanup operations when the JVM is shutting down using Runtime.addShutdownHook() method.
        // 5. Available Processors: You can get the number of available processors using Runtime.availableProcessors() method.

        // Example of using Runtime class methods
        Runtime runtime = Runtime.getRuntime(); // Getting the runtime instance
        Process process; // Declaring a Process variable to hold the process
        try {
            
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                // Windows command to open Notepad
                process = runtime.exec(new String[] { "notepad.exe" }, null, null); // Executing the command
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                // Mac command to open Notepad
                process = runtime.exec(new String[] { "textedit" }, null, null); // Executing the command
            } else {
                // Linux command to open Text Editor (e.g., gedit)
                process = runtime.exec(new String[] { "gedit" }, null, null);; // Executing the command
            }
            process.waitFor(); // Waiting for the process to complete
            System.out.println("Text editor opened successfully.");
        } catch (IOException e) {
            // TODO: handle exception
            System.err.println("The command is unknown or not supported on this OS." + e.getMessage());
            System.exit(1); // Exiting the program with an error status
        }
        System.out.println("The editor is closed.");
    }

}
