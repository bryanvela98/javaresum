package ObjectOrientedProgrammingClassesObjects12;

public class StaticMethodsAttributes {
    // Static attributes and methods belong to the class rather than any specific
    // instance of the class.
    // They can be accessed without creating an instance of the class.

    static String companyName = "TechCorp"; // Static attribute

    // Static method to get the company name
    public static String getCompanyName() {
        return companyName;
    }

    // Instance method to demonstrate access to static attribute
    public void displayCompanyInfo() {
        System.out.println("Company Name: " + companyName);
    }

    // When you update the static attribute, it reflects across all instances
    // of the class.
    public static void main(String[] args) {
        StaticMethodsAttributes obj1 = new StaticMethodsAttributes();
        StaticMethodsAttributes obj2 = new StaticMethodsAttributes();

        // Accessing static method
        System.out.println("Company Name (via static method): " + StaticMethodsAttributes.getCompanyName());

        // Accessing instance method
        obj1.displayCompanyInfo();
        obj2.displayCompanyInfo();

        // Modifying static attribute
        StaticMethodsAttributes.companyName = "NewTechCorp";

        // Accessing static method after modification
        System.out.println("Company Name (via static method): " + StaticMethodsAttributes.getCompanyName());

        // Accessing instance method after modification
        obj1.displayCompanyInfo();
        obj2.displayCompanyInfo();
    }
}
