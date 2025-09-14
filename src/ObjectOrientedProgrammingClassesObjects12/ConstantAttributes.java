package ObjectOrientedProgrammingClassesObjects12;

public class ConstantAttributes {
    // Constant attributes are declared using the 'final' keyword.
    // Once assigned, their values cannot be changed.
    // They are typically written in uppercase letters with underscores separating
    // words.

    final String COUNTRY = "USA"; // Constant attribute

    // Method to display the constant attribute
    public void displayCountry() {
        System.out.println("Country: " + COUNTRY);
    }

    public static void main(String[] args) {
        ConstantAttributes obj = new ConstantAttributes();
        obj.displayCountry();

        // Attempting to modify the constant attribute will result in a compilation
        // error
        // obj.COUNTRY = "Canada"; // Uncommenting this line will cause an error
    }
}
