package Arrays10;

public class IteratingArrays {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Iterating through an array using a for loop
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // Iterating through an array using a for-each loop
        for (int element : myArray) {
            System.out.println("Element: " + element);
        }

        // Iterating through an array using a while loop
        int index = 0;
        while (index < myArray.length) {
            System.out.println("Element at index " + index + ": " + myArray[index]);
            index++;
        }

        // Iterating through an array using a do-while loop
        index = 0;
        do {
            System.out.println("Element at index " + index + ": " + myArray[index]);
            index++;
        } while (index < myArray.length);  

        // Iterating an array inversely
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + (myArray.length - 1 - i) + ": " + myArray[myArray.length - 1 - i]);
        }
    }
}
