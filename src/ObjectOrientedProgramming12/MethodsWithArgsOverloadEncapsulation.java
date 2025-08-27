package ObjectOrientedProgramming12;

public class MethodsWithArgsOverloadEncapsulation {
    // To demonstrate method overloading and encapsulation, let's create a class called 'Calculator'
    class Calculator {

        // Overloading: Same method name with different parameters
        // Method overloading for addition
        int add(int a, int b) {
            return a + b;
        }
        // Method overloading for addition with double parameters
        double add(double a, double b) {
            return a + b;
        }

        // Encapsulation: Hiding the implementation details
        // Method with encapsulation
        private int subtract(int a, int b) {
            return a - b;
        }
        // Public method to access the private subtract method
        // It means we don't expose the implementation details, doesn't matter what is behind the subtract method
        public int publicSubtract(int a, int b) {
            return subtract(a, b);
        }

        // Polymorphism: Method overriding
        class AdvancedCalculator extends Calculator {
            // Overriding the add method
            @Override
            int add(int a, int b) {
                System.out.println("Advanced addition");
                return a + b;
            }
        }
    }
}
