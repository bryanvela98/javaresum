package Operators3;

public class OperatorsIntro {
    public static void main(String[] args) {
        
        // Java provides several operators to perform operations on variables and values.
        // Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.
        // They can be classified into several categories, including arithmetic, relational, logical, bitwise, assignment, and unary operators.

        // Arithmetic Operators: Used to perform basic mathematical operations.
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b)); // Addition
        System.out.println("Subtraction: " + (a - b)); // Subtraction
        System.out.println("Multiplication: " + (a * b)); // Multiplication
        System.out.println("Division: " + (a / b)); // Division
        System.out.println("Modulus: " + (a % b)); // Modulus (Remainder)
        System.out.println("Increment: " + (++a)); // Increment (Prefix), first increment then return the value
        System.out.println("Decrement: " + (--b)); // Decrement (Prefix), first decrement then return the value
        System.out.println("Increment: " + (a++)); // Increment (Postfix), first return the value then increment
        System.out.println("Decrement: " + (b--)); // Decrement (Postfix), first return the value then decrement

        // Combined Assignment Operators: Used to perform an operation and assign the result to a variable in one step.

        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c); // 15
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c); // 12
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c); // 24
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c); // 6
        c %= 2; // c = c % 2
        System.out.println("c %= 2: " + c); // 0
        
        // Ternary Operator: A shorthand for the if-else statement.

        int max = (a > b) ? a : b; // If a is greater than b, assign a to max, otherwise assign b to max
        System.out.println("Max: " + max); // 10

        // Relational Operators: Used to compare two values.
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators: Used to combine multiple boolean expressions.
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
        System.out.println("x ^ y: " + (x ^ y)); // Logical XOR (exclusive OR), true if one is true and the other is false

        
        // Bitwise Operators: Used to perform operations on bits.
        int p = 5; // 0101 in binary
        int q = 3; // 0011 in binary
        System.out.println("p & q: " + (p & q)); // Bitwise AND, 0001 in binary (1 in decimal)
        System.out.println("p | q: " + (p | q)); // Bitwise OR, 0111 in binary (7 in decimal)
        System.out.println("p ^ q: " + (p ^ q)); // Bitwise XOR, 0110 in binary (6 in decimal)
        System.out.println("~p: " + (~p)); // Bitwise NOT, 1010 in binary (10 in decimal, but negative due to two's complement representation)
        System.out.println("p << 1: " + (p << 1)); // Left shift, 1010 in binary (10 in decimal)
        System.out.println("p >> 1: " + (p >> 1)); // Right shift, 0010 in binary (2 in decimal)
        System.out.println("p >>> 1: " + (p >>> 1)); // Unsigned right shift, 0010 in binary (2 in decimal)
        System.out.println("p >>> 1: " + (p >>> 1)); // Unsigned right shift, 0010 in binary (2 in decimal)

        // Tip : Use parentheses to ensure the correct order of operations when combining multiple operators in a single expression.
        // For example, in the expression a + b * c, the multiplication will be performed first due to operator precedence.

        // Other tip: Primitive Data Type and Referenced Equivalent (Wrapper Classes)
        // int -> Integer
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean
        /* Why use wrapper classes? 
            * 1. They allow primitive types to be used in situations that require objects (like Collections)
            * 2. They provide useful methods to manipulate the data
            * 3. They enable null values (primitives can't be null)
            * 4. They facilitate automatic boxing and unboxing (since Java 5)    
        */
    }   

}
