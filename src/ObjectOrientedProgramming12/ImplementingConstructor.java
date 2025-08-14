package ObjectOrientedProgramming12;

public class ImplementingConstructor {

        // Constructor is a special method used to initialize objects.
        // It is called when an object of a class is created.
        // Constructors have the same name as the class and do not have a return type.

        private String name;
        private String email;

        // Constructor
        public ImplementingConstructor(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // Overloaded Constructor
        public ImplementingConstructor(String name) {
            this.name = name;
            this.email = "Not provided";
        }

}
