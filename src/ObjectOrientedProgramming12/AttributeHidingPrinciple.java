package ObjectOrientedProgramming12;

public class AttributeHidingPrinciple {
    public static void main(String[] args) {
        // Attribute Hiding Principle refers to the practice of restricting access to certain attributes
        // of an object to protect its integrity and prevent unintended interference.

        class Parent {
            private int hiddenAttribute = 5; // 'Private' means this attribute is not accessible outside this class

            public int getHiddenAttribute() {
                return hiddenAttribute;
            }
            public void setHiddenAttribute(int value) {
                hiddenAttribute = value;
            }
        }

        class Child extends Parent {
            public void display() {
                // Trying to access hiddenAttribute directly will result in an error, here is why we use getters function for accessing private attributes
                // System.out.println(hiddenAttribute); // Error: hiddenAttribute has private access in Parent
                System.out.println("Accessing hidden attribute through getter: " + getHiddenAttribute());
            }
            public void changeHiddenAttribute(int newValue) {
                setHiddenAttribute(newValue);
            }
        }

        Child child = new Child();
        child.display(); // This will print the value of hiddenAttribute using the public getter method
        child.changeHiddenAttribute(10);
        child.display(); // This will print the updated value of hiddenAttribute
    }
}
