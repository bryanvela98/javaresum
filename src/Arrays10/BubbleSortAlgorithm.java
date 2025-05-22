package Arrays10;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] myArray = {5, 2, 9, 1, 5, 6};

        // Bubble Sort Algorithm
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    // Swap elements
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        // Print sorted array
        System.out.println("Sorted array:");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }
}
