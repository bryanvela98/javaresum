package StringArrays2;

public class StringIntro {
    public static void main(String[] args) {
        
        //String type has an special caracteristic, it allows to create objects in the literal between double quotes.
        String str = "Hello World"; //String literal
        String str2 = new String("Hello World"); //String object

        //To include double quotes in a string, we can use the escape character \"
        //String caracters codify using Unicode, so we can use the \uxxx to include a character in the string.
        String str3 = "Hello \"World\""; //String with double quotes
        String str4 = "Hello \u0041"; //String with Unicode character 'A'

        //Strings are inmutable, so we can't change the value of a string once it is created.
        //We can use the StringBuilder class to create mutable strings.

        //With relational operators (==) we can compare strings by reference, but it is not recommended to use them.
        //We should use the equals() method to compare strings by value.
        String str5 = "Hello World";
        String str6 = new String("Hello World");
        System.out.println(str5 == str6); //false, because they are different references
        System.out.println(str5.equals(str6)); //true, because they are equal by value

        //Some methods of the String class:

        //int length(): returns the length of the string
        //boolean equals(Object obj): compares the string with another object
        //boolean equalsIgnoreCase(String str): compares the string with another string ignoring case
        //int compareTo(String str): compares the string with another string lexicographically
        //String trim(): removes leading and trailing whitespace from the string
        //char charAt(int index): returns the character at the specified index

        //other methods:

        //char[] toCharArray(): converts the string to a char array
        //String substring(int beginIndex): returns a substring from the specified index to the end of the string
        //String substring(int beginIndex, int endIndex): returns a substring from the specified index to the specified index
        //int indexOf(String str): returns the index of the first occurrence of the specified string in the string
        //int lastIndexOf(String str): returns the index of the last occurrence of the specified string in the string
        //boolean startsWith(String str): checks if the string starts with the specified string
        //boolean endsWith(String str): checks if the string ends with the specified string
        //String split(String regex): splits the string into an array of strings using the specified regular expression as a delimiter
        //String replace(String oldChar, String newChar): replaces all occurrences of the specified character with the specified character
        //String replaceAll(String regex, String replacement): replaces all occurrences of the specified regular expression with the specified string
        //String toLowerCase(): converts the string to lowercase
        //String toUpperCase(): converts the string to uppercase
        

    }

}
