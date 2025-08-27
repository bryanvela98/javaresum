package Arrays10;
import java.util.Scanner;

public class ExamplesVarious {
    public static void main(String[] args) {
        
        // Example 1: Printing i-th and (length - 1 - i)-th elements of an array
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        for (int i = 0; i < numbers.length/2; i++) {
            System.out.println(numbers[i]);
            System.out.println(numbers[numbers.length - 1 - i]);
        }

        // Example 2: Combining two arrays into a third array
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] combinedArray = new int[array1.length + array2.length];
        
        // Copy elements from array1
        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }       
        // Copy elements from array2
        for (int i = 0; i < array2.length; i++) {
            combinedArray[array1.length + i] = array2[i];
        }
        for (int i = 0; i < combinedArray.length; i++) {
            System.out.println(combinedArray[i]);
        }

        // Example 3: Finding the maximum element in an integer array
        int[] intArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 1;i <intArray.length; i++){
            max = (intArray[max]>intArray[i]) ? max : i;
        }
        System.out.println("The maximum element is: " + intArray[max]);

        // Example 4: Detecting if an array is sorted in ascending order or descending order
        
        int[] sortedArray = {1, 2, 3, 4, 5};
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] < sortedArray[i + 1]) {
                isDescending = false;
            } else if (sortedArray[i] > sortedArray[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
        
    }
}
