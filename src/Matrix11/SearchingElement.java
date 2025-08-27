package Matrix11;

public class SearchingElement {
    public static void main(String[] args) {
        // Searching for an element in a matrix can be done using nested loops.
        // Here we will search for a specific element in a 2D matrix.

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5; // Element to search for
        boolean found = false;

        // Nested loop to iterate through the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break; // Exit inner loop if found
                }
            }
            if (found) break; // Exit outer loop if found
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }
}
