package StringArrays2;

public class ArrIntro {
    public static void main(String[] args) {
        
        //String type has an special caracteristic, it allows to create objects in the literal between double quotes.
        String str = "Hello World"; //String literal
        String str2 = new String("Hello World"); //String object

        //To include double quotes in a string, we can use the escape character \"
        //String caracters codify using Unicode, so we can use the \uXXXX to include a character in the string.
        String str3 = "Hello \"World\""; //String with double quotes
        String str4 = "Hello \u0041"; //String with Unicode character 'A'

        //Strings are inmutable, so we can't change the value of a string once it is created.
        //We can use the StringBuilder class to create mutable strings.
    }

}
