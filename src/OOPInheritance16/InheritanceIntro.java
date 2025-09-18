package OOPInheritance16;

public class InheritanceIntro {
    /*
     * Inheritance is a mechanism in which one object acquires all the properties
     * and behaviors of a parent object. Inheritance can't exist if there is no
     * relationship between two classes. The class which inherits the properties of
     * another is called the subclass (or derived class, child class, or extended
     * class). The class whose properties are inherited is called the superclass (or
     * base class, parent class, or extended class).
     * 
     * The term "extends" is used to indicate that a class is inheriting the
     * properties of another class. The keyword "super" is used to refer to the
     * immediate parent class object. The keyword "this" is used to refer to the
     * current class object. The "super()" function is used to call the constructor
     * of the parent class. The "this()" function is used to call the constructor of
     * the current class. The "instanceof" keyword is used to check whether an
     * object is an instance of a specific class or a subclass thereof.
     * 
     * For example: class Animal { void eat() {
     * System.out.println("This animal eats food."); } } class Dog extends Animal {
     * void bark() { System.out.println("The dog barks."); } } In this example, the
     * Dog class inherits the eat method from the Animal class. The Dog class can
     * also have its own methods, such as bark. The Dog class is a subclass of
     * Animal, and Animal is the superclass of Dog.
     * 
     * There are two ways to use inheritance: 1. Generalization: This is the process
     * of extracting shared characteristics from two or more classes and combining
     * them into a generalized superclass. For example, if we have two classes, Dog
     * and Cat, we can create a superclass called Animal that contains the shared
     * characteristics of both classes. 2. Specialization: This is the process of
     * creating new subclasses from an existing superclass by adding specific
     * characteristics. For example, we can create a subclass called Bulldog that
     * inherits from the Dog class and adds characteristics specific to bulldogs.
     * 
     * Super keyword: The super keyword in Java is a reference variable that is used
     * to refer to the immediate parent class object. It can be used to access
     * parent class methods and variables. It can also be used to call the parent
     * class constructor. For example: class Animal { void eat() {
     * System.out.println("This animal eats food."); } } class Dog extends Animal {
     * void bark() { System.out.println("The dog barks."); } void display() {
     * super.eat(); // Calling parent class method bark(); } } In this example, the
     * display method in the Dog class calls the eat method from the Animal class
     * using the super keyword.
     * 
     * Other key caracteristic of Inheritance is the ability to override parent
     * class methods in the child class. This allows the child class to provide a
     * specific implementation of a method that is already defined in the parent
     * class. For example: class Animal { void eat() {
     * System.out.println("This animal eats food."); } } class Dog extends Animal {
     * void eat() { // Overriding parent class method
     * System.out.println("The dog eats dog food."); } } In this example, the Dog
     * class overrides the eat method from the Animal class to provide a specific
     * implementation for dogs.
     */
}