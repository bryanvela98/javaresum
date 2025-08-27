package Matrix11;

public class TransposedMatrix {
    public static void main(String[] args) {
        // Transposed matrices are obtained by swapping the rows and columns of a matrix.
        // The element at position (i, j) in the original matrix becomes the element at (j, i) in the transposed matrix.

        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Creating a transposed matrix
        int[][] transposedMatrix = new int[originalMatrix[0].length][originalMatrix.length];

        // Filling the transposed matrix
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // Printing the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
