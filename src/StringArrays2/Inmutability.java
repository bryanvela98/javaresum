package StringArrays2;

public class Inmutability {
    public static void main(String[] args) {
        
        //String is immutable, meaning once created, its value cannot be changed.
        String str1 = "Hello";
        String str2 = str1; // str2 references the same object as str1
        str1 = "World"; // str1 now references a new object
        System.out.println("str1: " + str1); // Output: World
        System.out.println("str2: " + str2); // Output: Hello

        
    }
}
