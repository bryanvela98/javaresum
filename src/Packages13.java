

public class Packages13 {
    // Packages are used to group related classes and interfaces together.
    // They help to organize the code and avoid naming conflicts.
    // For example, we can have a package for all the classes related to
    // user management, another package for all the classes related to
    // product management, etc.

    // To create a package, we use the 'package' keyword followed by the
    // package name at the top of the Java file.
    // For example, in this file, we have declared the package as 'Packages13'.

    // To use a class from another package, we need to import it using
    // the 'import' keyword followed by the package name and class name.
    // For example, if we want to use the RelatedClassPersona class from
    // the ObjectOrientedProgramming12 package, we would write:
    // import ObjectOrientedProgramming12.RelatedClassPersona;

    // We can also use wildcard imports to import all classes from a package.
    // For example:
    // import ObjectOrientedProgramming12.*;

    // However, it's generally better to import only the specific classes
    // that we need to avoid unnecessary dependencies.

    // Note: The directory structure of the project should match the package
    // structure. For example, if we have a package named 'Packages13',
    // the corresponding directory should be named 'Packages13'.

    // Tips for using packages:
    // 1. It should be in lowercase to avoid conflicts with class names.
    // 2. Typically, the package name is the domain name of the organization(org, es, mx, com)  in reverse order followed by the project name and module name.
    //    For example, com.techcorp.project.module

    /* 
     * To limitate access to a class, we can use the (default) access modifier (no modifier).
     * This means that the class can only be accessed by other classes in the same package.
     * If we want to allow access to the class from other packages, we can use the (public) access modifier.
     * If we want to restrict access to the class to only subclasses, we can use the (protected) access modifier.
     */

    // Static imports allow us to import static members (fields and methods) of a class
    // so that we can use them without class qualification.
    // For example, if we have a class Math with a static method sqrt, we can import it like this:
    // import static java.lang.Math.sqrt;
    // Then we can use the sqrt method directly without the Math prefix:
    // double result = sqrt(25);
}
