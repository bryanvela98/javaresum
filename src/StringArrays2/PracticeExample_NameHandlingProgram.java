package StringArrays2;

public class PracticeExample_NameHandlingProgram {
    public static void main(String[] args) {
        /* This exercise consists of creating a class called NameHandlingProgram as follows:
            -You need to develop a program that accepts the names of three family members or friends as command line arguments.
            -For each person's name, a new String variable is requested by taking the second character but converting it to uppercase and concatenating a period and the last two characters of the person. For example, for Andres, it should be N.es.
            -The three new names should be printed as a result, separated by an underscore (as a single variable).

            For example, an expected final result for the names Andres, Maria, and Pepe could be:
            N.es_A.ia_E.pe 
        */

        // Solution
        // Check if three names are provided as command line arguments
        if (args.length != 3) {
            System.out.println("Please provide exactly three names as command line arguments.");
            return;
        }

        // Extract the names from command line arguments
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

        // Create new String variables for each name
        String newName1 = name1.charAt(1) + "." + name1.substring(name1.length() - 2);
        String newName2 = name2.charAt(1) + "." + name2.substring(name2.length() - 2);
        String newName3 = name3.charAt(1) + "." + name3.substring(name3.length() - 2);

        // Convert the second character to uppercase
        newName1 = newName1.substring(0, 1).toUpperCase() + newName1.substring(1);
        newName2 = newName2.substring(0, 1).toUpperCase() + newName2.substring(1);
        newName3 = newName3.substring(0, 1).toUpperCase() + newName3.substring(1);

        // Concatenate the new names with underscores
        String result = newName1 + "_" + newName2 + "_" + newName3;

        // Print the result
        System.out.println("Result: " + result); 
    }
}
