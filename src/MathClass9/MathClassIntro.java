package MathClass9;

public class MathClassIntro {
    public static void main(String[] args) {
        
        // The Math class is a final class in Java that provides methods for performing basic numeric operations such as exponentiation, logarithms, square roots, and trigonometric functions.
        // It is part of the java.lang package and is automatically imported into every Java program.

        // Absolute Value
        int absValue = Math.abs(-10);
        System.out.println("Absolute value of -10: " + absValue); // Output: 10

        // Square Root
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square root of 25: " + sqrtValue); // Output: 5.0

        // Max and Min
        int maxValue = Math.max(10, 20);
        System.out.println("Max of 10 and 20: " + maxValue); // Output: 20

        int minValue = Math.min(10, 20);
        System.out.println("Min of 10 and 20: " + minValue); // Output: 10

        // Ceiling and Floor
        double ceilValue = Math.ceil(5.3);
        System.out.println("Ceiling of 5.3: " + ceilValue); // Output: 6.0

        double floorValue = Math.floor(5.7);
        System.out.println("Floor of 5.7: " + floorValue); // Output: 5.0

        // Logarithm
        double logValue = Math.log(100);
        System.out.println("Natural logarithm of 100: " + logValue); // Output: 4.605170185988092

        // Square and Power
        double squareValue = Math.pow(5, 2);
        System.out.println("5 squared: " + squareValue); // Output: 25.0

        double powerValue = Math.pow(2, 3);
        System.out.println("2 to the power of 3: " + powerValue); // Output: 8.0

        // Trigonometric Functions
        double sinValue = Math.sin(Math.PI / 2);
        System.out.println("Sine of 90 degrees (PI/2 radians): " + sinValue); // Output: 1.0

        double cosValue = Math.cos(Math.PI);
        System.out.println("Cosine of 180 degrees (PI radians): " + cosValue); // Output: -1.0

        double tanValue = Math.tan(Math.PI / 4);
        System.out.println("Tangent of 45 degrees (PI/4 radians): " + tanValue); // Output: 1.0

        double radians = Math.toRadians(45);
        System.out.println("45 degrees in radians: " + radians); // Output: 0.7853981633974483

        double degrees = Math.toDegrees(Math.PI / 4);
        System.out.println("PI/4 radians in degrees: " + degrees); // Output: 45.0
    }

}
