package WrapperClasses5;

import java.util.ArrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {

    /*
    Wrapper Classes:

    Provide a way to use primitive data types (int, char, float, etc.) as objects.  
    Necessary for using primitives in collections (like ArrayList) and other object-oriented contexts.

    Each primitive type has a corresponding wrapper class:

    * int: Integer
    * char: Character
    * byte: Byte
    * short: Short
    * long: Long
    * float: Float
    * double: Double
    * boolean: Boolean
    */

    // Example usage:
        // Integer wrapper (for int)
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);  // boxing
        int unwrappedInt = wrappedInt.intValue();           // unboxing
        System.out.println("Integer: " + wrappedInt);

        // Character wrapper (for char)
        char primitiveChar = 'A';
        Character wrappedChar = Character.valueOf(primitiveChar);
        char unwrappedChar = wrappedChar.charValue();
        System.out.println("Character: " + wrappedChar);

        // Byte wrapper (for byte)
        byte primitiveByte = 127;
        Byte wrappedByte = Byte.valueOf(primitiveByte);
        byte unwrappedByte = wrappedByte.byteValue();
        System.out.println("Byte: " + wrappedByte);

        // Short wrapper (for short)
        short primitiveShort = 32000;
        Short wrappedShort = Short.valueOf(primitiveShort);
        short unwrappedShort = wrappedShort.shortValue();
        System.out.println("Short: " + wrappedShort);

        // Long wrapper (for long)
        long primitiveLong = 123456789L;
        Long wrappedLong = Long.valueOf(primitiveLong);
        long unwrappedLong = wrappedLong.longValue();
        System.out.println("Long: " + wrappedLong);

        // Float wrapper (for float)
        float primitiveFloat = 3.14f;
        Float wrappedFloat = Float.valueOf(primitiveFloat);
        float unwrappedFloat = wrappedFloat.floatValue();
        System.out.println("Float: " + wrappedFloat);

        // Double wrapper (for double)
        double primitiveDouble = 3.14159;
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        double unwrappedDouble = wrappedDouble.doubleValue();
        System.out.println("Double: " + wrappedDouble);

        // Boolean wrapper (for boolean)
        boolean primitiveBoolean = true;
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);
        boolean unwrappedBoolean = wrappedBoolean.booleanValue();
        System.out.println("Boolean: " + wrappedBoolean);

        // Example of using wrapper in Collections
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);    // Autoboxing happens here
        numbers.add(10);
        System.out.println("ArrayList of Integers: " + numbers);

        // String to wrapper conversion examples
        Integer stringToInt = Integer.parseInt("123");
        Double stringToDouble = Double.parseDouble("123.45");
        Boolean stringToBoolean = Boolean.parseBoolean("true");
        
        System.out.println("Parsed values: " + stringToInt + ", " + 
                          stringToDouble + ", " + stringToBoolean);
    }
}
