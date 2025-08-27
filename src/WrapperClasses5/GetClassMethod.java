package WrapperClasses5;

import java.lang.reflect.Method; // Importing Method

public class GetClassMethod {
    public static void main(String[] args) {
        
        /*
        * The getClass() method is used to get information about the class of an object.
        * It's like asking an object "What kind of object are you?"
        * This is useful when you need to:
        * - Check what type of object you're working with
        * - Compare different object types
        * - Get information about a class during program execution
        */

        // Example

        String text = "Hello, how are you";

        Class strClass = text.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());

        // This will list all methods for String Class

        for(Method method: strClass.getMethods()){
            System.out.println("method.getName() =" + method.getName());
        } 
    }
}
