package ObjectOrientedProgramming12;

public class ImplementingConstructor {

        // Constructor is a special method used to initialize objects.
        // It is called when an object of a class is created.
        // Constructors have the same name as the class and do not have a return type.

        private String name;
        private String email;
        private int age;
        private String address;

        // Constructor
        public ImplementingConstructor(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // Overloaded Constructor I
        public ImplementingConstructor(String name, String email, int age) {
            this(name, email); // Calling the main constructor
            this.age = age;
        }

        // Overloaded Constructor II
        public ImplementingConstructor(String name, String email, int age, String address) {
            this(name, email, age); // Calling the overloaded constructor I
            this.address = address;
        }

}
