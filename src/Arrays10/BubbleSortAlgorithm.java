package Arrays10;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] myArray = {5, 2, 9, 1, 5, 6};

        // Bubble Sort Algorithm
        boolean swapped;
        for (int i = 0; i < myArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < myArray.length - 1 - i; j++) {
            if (myArray[j] > myArray[j + 1]) {
                // Swap elements
                int temp = myArray[j];
                myArray[j] = myArray[j + 1];
                myArray[j + 1] = temp;
                swapped = true;
            }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
        // Print sorted array
        System.out.println("Sorted array:");
        for (int element : myArray) {
            System.out.print(element + " ");
        }

        // This is a simple implementation of the Bubble Sort algorithm, which sorts an array in ascending order. The algorithm repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the
        // list is repeated until the list is sorted. The algorithm gets its name from the way larger elements "bubble" to the top of the list.
        // Bubble Sort is not the most efficient sorting algorithm, especially for large datasets, but it is easy to understand and implement. It has a time complexity of O(n^2) in the average and worst cases, where n is the number of items being sorted.
    }
}
