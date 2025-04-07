package StringArrays2;

public class StringValidation {
    public static void main(String[] args) {
        // String validation examples
        
        String str1 = null; // null string

        boolean isNullOrEmpty = str1 == null || str1.isEmpty(); // Check if the string is null or empty
        System.out.println("Is str1 null or empty? " + isNullOrEmpty); // Output: true

        //Here is why  we should use an if statement to check if the string is null or empty before calling isEmpty()
        if (isNullOrEmpty) {
            str1 = ""; // Assign an empty string if str1 is null or empty
        }

        //Checking if is blank
        String str2 = "   "; // String with only whitespace
        boolean isBlank = str2.isBlank(); // Check if the string is blank (contains only whitespace)
        System.out.println("Is str2 blank? " + isBlank); // Output: true
        //With isBlank() we can check if the string is empty or contains only whitespace characters.
        //It is a good practice to use isBlank() instead of isEmpty() when we want to check if a string is empty or contains only whitespace characters.
        //It is more readable and easier to understand than using a combination of isEmpty() and trim().
    }
}
