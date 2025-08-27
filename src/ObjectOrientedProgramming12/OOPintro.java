package ObjectOrientedProgramming12;

public class OOPintro {
    public static void main(String[] args) {
        /* 
        ** The objects as concept, outside of IT, have always existed before programming.
        ** The objects in programming are the instances of the classes.
        ** The classes are the blueprints of the objects.
        ** The attributes of the objects are the properties defined in the class.
        ** The methods of the objects are the functions defined in the class.
        ** The objects can interact with each other through their methods.
        ** The objects can also have their own state, which is represented by their attributes.
         */

        // Creating objects:
        // To create an object, you need to define a class first.
        // For example, let's define a class called 'Car'
        class Car {
            // Attributes
            String color;
            String model;

            // Constructor
            Car(String color, String model) {
                this.color = color;
                this.model = model;
            }

            // Method
            void displayInfo() {
                System.out.println("Car model: " + model + ", Color: " + color);
            }
        }

        // Creating objects
        Car car1 = new Car("Red", "Toyota");
        Car car2 = new Car("Blue", "Honda");

        // Accessing object methods
        car1.displayInfo();
        car2.displayInfo();

    }
}
