package Variables1;

public class PrimitiveVariables {
    public static void main(String[] args) {
        // Primitive data types
        // 1. byte: 8 bits, range: -128 to 127
        byte byteVar = 100;
        System.out.println("Byte value: " + byteVar);

        // 2. short: 16 bits, range: -32,768 to 32,767
        short shortVar = 30000;
        System.out.println("Short value: " + shortVar);

        // 3. int: 32 bits, range: -2^31 to 2^31-1
        int intVar = 2000000000;
        System.out.println("Int value: " + intVar);

        // 4. long: 64 bits, range: -2^63 to 2^63-1
        long longVar = 9000000000L; // 'L' suffix for long literal
        System.out.println("Long value: " + longVar);

        // 5. float: 32 bits, range: approximately ±3.40282347E+38 (7 decimal digits)
        float floatVar = 5.75f; // 'f' suffix for float literal
        System.out.println("Float value: " + floatVar);

        // 6. double: 64 bits, range: approximately ±1.79769313486231570E+308 (15 decimal digits)
        double doubleVar = 19.99;
        System.out.println("Double value: " + doubleVar);

        // 7. char: single 16-bit Unicode character
        char charVar = 'A';
        System.out.println("Char value: " + charVar);
        // char can also be assigned a Unicode value
        // char unicodeChar = '\u0041'; // Unicode for 'A'
        // char can also be assigned escaped characters
        // '\n'; // Newline character
        // '\t'; // Tab character
        // '\b'; // Backspace character
        // '\r'; // Carriage return character
        // '\f'; // Form feed character
        // '\\'; // Backslash character
        // '\''; // Single quote character

        // 8. boolean: true or false
        boolean boolVar = true;
        System.out.println("Boolean value: " + boolVar);
    }
}
