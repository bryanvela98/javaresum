package Matrix11;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Arithmetic operations on matrices can be performed element-wise.
        // Here we will demonstrate addition and subtraction of two matrices.

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Assuming both matrices are of the same size
        int[][] sumMatrix = new int[matrixA.length][matrixA[0].length];
        int[][] diffMatrix = new int[matrixA.length][matrixA[0].length];

        // Performing addition and subtraction
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                diffMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
    }
}
