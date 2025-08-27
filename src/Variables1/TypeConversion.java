package Variables1;

public class TypeConversion {
    public static void main(String[] args) {
        
        //String to primitive type conversion

        String numStr = "123"; // String representation of a number
        int numberInt = Integer.parseInt(numStr); // Convert String to int
        System.out.println("Converted int: " + numberInt);

        String realStr = "98746.43e-3"; // String representation of a real number
        double numberDouble = Double.parseDouble(realStr); // Convert String to double
        System.out.println("Converted int: " + numberDouble);

        String logicStr = "true"; // String representation of a boolean
        boolean numberBool = Boolean.parseBoolean(logicStr); // Convert String to boolean
        System.out.println("Converted boolean: " + numberBool);

        //Primitive to String conversion

        int otherIntNumber = 123; // Integer value
        String strInt = Integer.toString(otherIntNumber); // Convert int to String
        System.out.println("Converted String: " + strInt);

        double otherDoubleNumber = 123.45e2; // Double value
        String strDouble = Double.toString(otherDoubleNumber); // Convert double to String
        System.out.println("Converted String: " + strDouble);

        //Conversion between primitive types (avoid data loss)
        //int to double
        int intNumber = 10;
        double doubleNumber = intNumber; // Implicit conversion (widening conversion)
        short shortNumber = (short) intNumber; // Explicit conversion (narrowing conversion)
        //Always use explicit conversion when converting from a larger type to a smaller type to avoid data loss.
    }

}
