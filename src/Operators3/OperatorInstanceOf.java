package Operators3;

public class OperatorInstanceOf {
    public static void main(String[] args) {
        
        // The instanceof operator is used to test whether an object is an instance of a specific class or subclass.
        // It returns true if the object is an instance of the specified class, and false otherwise.

        String str = "Hello, World!";
        boolean result = str instanceof String; // Check if str is an instance of String
        System.out.println("Is str an instance of String? " + result); // true

        Integer num = 10;
        boolean result2 = num instanceof Integer; // Check if num is an instance of Integer
        System.out.println("Is num an instance of Integer? " + result2); // true

        Object obj = new Object();
        boolean result3 = obj instanceof Object; // Check if obj is an instance of Object
        System.out.println("Is obj an instance of Object? " + result3); // true

        //But what happens if we check Short or Long instanceof Integer?
        Short shortNum = 5; // Short is a subclass of Number, but not of Integer
        boolean result4 = shortNum instanceof Integer; // Check if shortNum is an instance of Integer
        //It will throw a compile-time error because Short is not a subclass of Integer.

        // InstaceOf with abstract types
        // The instanceof operator can also be used with abstract classes and interfaces.
        // For example, if you have an abstract class Animal and a concrete class Dog that extends Animal

        // Valueof

        // The valueOf() method is a static method in the Integer class that converts a String to an Integer object.
        // It is a convenient way to create Integer objects from String representations of numbers.
        // The valueOf() method is overloaded to accept different types of arguments, including String, int, and other primitive types.
        // It returns an Integer object representing the specified value.

        String strNum = "123";
        Integer intValue = Integer.valueOf(strNum); // Convert String to Integer
        System.out.println("Integer value: " + intValue); // 123

        // Note: If the string cannot be parsed as an integer, a NumberFormatException will be thrown.

        // To debug: right click on the line number and select "Toggle Breakpoint"
        // Then run the program in debug mode. You can step through the code line by line to see how it executes.

}
}