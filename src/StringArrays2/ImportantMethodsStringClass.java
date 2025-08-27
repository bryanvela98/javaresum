package StringArrays2;

public class ImportantMethodsStringClass {
    public static void main(String[] args) {
        
        String name = "John";

        // String length
        int length = name.length(); // Returns the length of the string
        System.out.println("Length of name: " + length); // Output: 4

        // To upper case
        String upperCaseName = name.toUpperCase(); // Converts the string to upper case
        System.out.println("Upper case name: " + upperCaseName); // Output: JOHN

        // To lower case
        String lowerCaseName = name.toLowerCase(); // Converts the string to lower case
        System.out.println("Lower case name: " + lowerCaseName); // Output: john

        // Equals (same as compareTo)
        // The equals() method compares the string with another string for equality
        // The compareTo() method compares the string with another string lexicographically
        String anotherName = "John"; // Another string to compare
        boolean isEqual = name.equals(anotherName); // Compares the two strings for equality
        System.out.println("Are names equal? " + isEqual); // Output: true
        boolean isDifferente = name.compareTo(anotherName) == 0; // Compares the two strings lexicographically
        System.out.println("Are names equal? " + isDifferente); // Output: true

        // Equals ignore case
        String differentCaseName = "john"; // Another string with different case
        boolean isEqualIgnoreCase = name.equalsIgnoreCase(differentCaseName); // Compares the two strings ignoring case
        System.out.println("Are names equal ignoring case? " + isEqualIgnoreCase); // Output: true

        // CharAt
        char firstChar = name.charAt(0); // Returns the character at index 0
        System.out.println("First character of name: " + firstChar); // Output: J

        // Substring
        String subString = name.substring(1); // Returns the substring from index 1 to the end of the string
        System.out.println("Substring from index 1: " + subString); // Output: ohn
        String subString2 = name.substring(1, 3); // Returns the substring from index 1 to index 3 (exclusive)
        System.out.println("Substring from index 1 to 3: " + subString2); // Output: oh

        // Replace
        String replacedName = name.replace("o", "a"); // Replaces all occurrences of 'o' with 'a'
        System.out.println("Replaced name: " + replacedName); // Output: Jahn

        // IndexOf
        int indexOfO = name.indexOf("o"); // Returns the index of the first occurrence of 'o'
        System.out.println("Index of 'o': " + indexOfO); // Output: 1

        // LastIndexOf
        int lastIndexOfO = name.lastIndexOf("o"); // Returns the index of the last occurrence of 'o'
        System.out.println("Last index of 'o': " + lastIndexOfO); // Output: 1

        // Contains
        boolean containsO = name.contains("o"); // Checks if the string contains 'o' and returns true or false
        System.out.println("Does name contain 'o'? " + containsO); // Output: true

        // StartsWith
        boolean startsWithJ = name.startsWith("J"); // Checks if the string starts with 'J' and returns true or false
        System.out.println("Does name start with 'J'? " + startsWithJ); // Output: true

        // EndsWith
        boolean endsWithN = name.endsWith("n"); // Checks if the string ends with 'n' and returns true or false
        System.out.println("Does name end with 'n'? " + endsWithN); // Output: true

        // Split
        String sentence = "Hello, how are you?"; // A sentence to split
        String[] words = sentence.split(" "); // Splits the sentence into words using space as a delimiter
        System.out.println("Words in the sentence: ");
        for (String word : words) {
            System.out.println(word); // Output: Hello, how are you?
        }

        // Trim
        String paddedString = "   Hello World   "; // A string with leading and trailing spaces
        String trimmedString = paddedString.trim(); // Removes leading and trailing spaces
        System.out.println("Trimmed string: '" + trimmedString + "'"); // Output: 'Hello World'

        // Geetting extension of a file (Example)
        String fileName = "document.txt"; // A file name
        int dotIndex = fileName.lastIndexOf("."); // Finds the last index of '.'
        System.out.println("File length: " + fileName.length()); // Output: 12
        System.out.println("fileName.substring(fileName.length() - 4): " + fileName.substring(dotIndex+1)); // Output: txt


        // Some util methods to convert a string to an array of characters or words and vice versa

        // Using toCharArray() method to convert a string to a char array
        String str = "Hello"; // A string to convert
        char[] charArray = str.toCharArray(); // Converts the string to a char array
        System.out.println("Char array: ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " "); // Output: H e l l o
        }

        // Using split() method to convert a string to an array of strings
        String str2 = "Hello,World,Java"; // A string to convert
        String[] strArray = str2.split(","); // Splits the string into an array of strings using ',' as a delimiter
        System.out.println("\nString array: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " "); // Output: Hello World Java
        }
    }

}
