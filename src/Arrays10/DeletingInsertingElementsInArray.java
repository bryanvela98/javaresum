package Arrays10;

public class DeletingInsertingElementsInArray {
    public static void main(String[] args) {
        // Deleting without leaving wholes in the array
        int[] array = {1, 2, 3, 4, 5};
        int indexToDelete = 2; // Index of the element to delete (3 in this case)
        for (int i = indexToDelete; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array = java.util.Arrays.copyOf(array, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Inserting an element at a specific position
        int[] newArray = new int[array.length + 1];
        int indexToInsert = 2; // Index where we want to insert the new element (after 2)
        int newElement = 99; // Element to insert
        for (int i = 0; i < newArray.length; i++) {
            if (i < indexToInsert) {
                newArray[i] = array[i];
            } else if (i == indexToInsert) {
                newArray[i] = newElement;
            } else {
                newArray[i] = array[i - 1]; // Shift elements to the right
            }
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Inserting an element at the end of the array
        int[] anotherArray = new int[array.length + 1];
        int newElementAtEnd = 100;
        for (int i = 0; i < anotherArray.length; i++) {
            if (i < array.length) {
                anotherArray[i] = array[i];
            } else {
                anotherArray[i] = newElementAtEnd;
            }
        }
        
        for (int num : anotherArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
