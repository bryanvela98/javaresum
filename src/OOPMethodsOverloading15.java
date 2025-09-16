public class OOPMethodsOverloading15 {
    /*
     * What is method overloading?
     * Method overloading is a feature that allows a class to have more than one method
     * with the same name, but different parameters (different type, number, or both) and functionality.
     * The correct method is chosen at compile time based on the arguments passed to the method.
     * This is a way to achieve polymorphism in Java.
     * 
     * Example of method overloading:
     * public class MathUtils {
     *     // Method to add two integers
     *     public int add(int a, int b) {
     *         return a + b;
     *     }
     *     // Overloaded method to add three integers
     *     public int add(int a, int b, int c) {
     *         return a + b + c;
     *     }
     *     // Overloaded method to add two doubles
     *     public double add(double a, double b) {
     *         return a + b;
     *     }
     * }
     * In this example, the add method is overloaded three times with different parameter lists.
     * This allows users of the MathUtils class to add integers or doubles, and to add either two or three integers.
     * The appropriate method is called based on the arguments provided.
      */

    /* 
     * Overloading and static methods
     * Static methods can also be overloaded in the same way as instance methods.
     * The same rules apply: the methods must have the same name but different parameter lists.
     * Example:
     * public class MathUtils {
     *     // Static method to add two integers
     *     public static int add(int a, int b) {
     *         return a + b;
     *     }
     *     // Overloaded static method to add three integers
     *     public static int add(int a, int b, int c) {
     *         return a + b + c;
     *     }
     *     // Overloaded static method to add two doubles
     *     public static double add(double a, double b) {
     *         return a + b;
     *     }
     * }
     * In this example, the add method is overloaded three times as static methods.
     * Users can call these methods without creating an instance of the MathUtils class.
     * Example usage:
     * int sum1 = MathUtils.add(5, 10); // Calls the first method
     * int sum2 = MathUtils.add(5, 10, 15); // Calls the second method
     * double sum3 = MathUtils.add(5.5, 10.5); // Calls the third method
     */
}
