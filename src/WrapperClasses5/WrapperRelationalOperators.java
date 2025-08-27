package WrapperClasses5;

public class WrapperRelationalOperators {
    public static void main(String[] args) {
    /*
    * Understanding relational operators with wrapper classes is crucial because:
    * 
    * 1. Object Comparison vs Primitive Comparison
    *    - Primitives use simple comparison operators (==, !=, <, >, etc.)
    *    - Wrapper objects require special consideration due to their object nature
    * 
    * 2. Common Pitfalls
    *    - Using == instead of equals()
    *    - Not understanding Integer caching
    *    - Ignoring null possibilities
    * 
    * 3. Key Methods for Comparison
    *    - equals(): For value equality
    *    - compareTo(): For ordering comparison
    *    - valueOf(): For creating wrapper objects
    * 
    * 4. Integer Cache
    *    - Java caches commonly used integers (-128 to 127)
    *    - Affects how == operator behaves
    * 
    * 5. Best Practices
    *    - Always use equals() for value comparison
    *    - Handle null cases explicitly
    *    - Be aware of autoboxing and unboxing
    *    - Understand type differences
    */

        // 1. Using equals() method for comparison
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = Integer.valueOf(100);
        
        System.out.println("\n=== equals() Method Comparison ===");
        System.out.println("num1.equals(num2): " + num1.equals(num2));     // true
        System.out.println("num1.equals(num3): " + num1.equals(num3));     // true
        System.out.println("num1.equals(100): " + num1.equals(100));       // true

        // 2. Using == operator (Integer Cache)
        System.out.println("\n=== == Operator with Integer Cache (-128 to 127) ===");
        Integer cached1 = 127;
        Integer cached2 = 127;
        System.out.println("127 == 127: " + (cached1 == cached2));         // true (uses cache)

        Integer notCached1 = 200;
        Integer notCached2 = 200;
        System.out.println("200 == 200: " + (notCached1 == notCached2));   // false (outside cache)

        // 3. Comparison with compareTo() method
        System.out.println("\n=== compareTo() Method ===");
        Integer x = 5;
        Integer y = 10;
        
        System.out.println("5 compareTo 10: " + x.compareTo(y));           // negative (-1)
        System.out.println("10 compareTo 5: " + y.compareTo(x));           // positive (1)
        System.out.println("5 compareTo 5: " + x.compareTo(x));            // zero (0)

        // 4. Comparing different wrapper types
        System.out.println("\n=== Comparing Different Types ===");
        Double d1 = 5.0;
        Integer i1 = 5;
        
        System.out.println("5.0 equals 5: " + (d1.doubleValue() == i1.intValue())); // true
        System.out.println("5.0 == 5: " + (d1.doubleValue() == i1.intValue())); // true


        // 5. Boolean wrapper comparison
        System.out.println("\n=== Boolean Wrapper Comparison ===");
        Boolean b1 = true;
        Boolean b2 = true;
        Boolean b3 = false;
        
        System.out.println("true equals true: " + b1.equals(b2));          // true
        System.out.println("true equals false: " + b1.equals(b3));         // false


        // 6. Comparing across ranges
        System.out.println("\n=== Range Comparisons ===");
        Integer small1 = 50;
        Integer small2 = 50;
        Integer large1 = 1000;
        Integer large2 = 1000;
        System.out.println("Small numbers (50) ==: " + (small1 == small2));    // true
        System.out.println("Large numbers (1000) ==: " + (large1 == large2));  // false

    }
}
