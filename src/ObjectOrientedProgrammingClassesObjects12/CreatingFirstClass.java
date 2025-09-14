package ObjectOrientedProgrammingClassesObjects12;

public class CreatingFirstClass {
    public static void main(String[] args) {
        // Creating an Animal example class
        class Animal {
            // Attributes
            String name;
            int age;

            // Constructor
            Animal(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Method without args
            void displayInfo() {
                System.out.println("Animal Name: " + name + ", Age: " + age);
            }

            // Method with args
            void makeSound(String sound) {
                System.out.println(name + " makes a " + sound + " sound.");
            }
        }

        // Creating objects
        Animal animal1 = new Animal("Lion", 5);
        Animal animal2 = new Animal("Elephant", 10);

        // Accessing object methods
        animal1.displayInfo();
        animal1.makeSound("Roar");
        animal2.displayInfo();
        animal2.makeSound("Trumpet");
    }
}
