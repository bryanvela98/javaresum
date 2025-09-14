package ObjectOrientedProgrammingClassesObjects12;

public class EqualsMethod {
    public static void main(String[] args) {
        // Defining Car class
        class Car {
            String model;
            String color;
            int year;
            String engine;

            Car(String model, String color, int year, String engine) {
                this.model = model;
                this.color = color;
                this.year = year;
                this.engine = engine;
            }

            // Overriding the equals() method to compare Car objects based on their
            // attributes
            @Override
            public boolean equals(Object obj) {
                Car a = (Car) obj;
                return (this.color.equals(a.color) && this.engine.equals(a.engine) && this.model.equals(a.model)
                        && this.year == a.year);
            }
        }

        // Creating two Car objects with identical attributes
        Car car1 = new Car("ModelX", "Red", 2020, "V8");
        Car car2 = new Car("ModelX", "Red", 2020, "V8");

        // Comparing the two objects using '=='
        if (car1 == car2) {
            System.out.println("car1 and car2 are the same object (using ==)");
        } else {
            System.out.println("car1 and car2 are different objects (using ==)");
        }

        // Comparing the two objects using the overridden equals() method
        if (car1.equals(car2)) {
            System.out.println("car1 and car2 are equal (using equals())");
        } else {
            System.out.println("car1 and car2 are not equal (using equals())");
        }
    }
}
