package Matrix11;

public class SymetricMatrix {
    public static void main(String[] args) {
        // Symetric matrices are square matrices that are equal to their transpose.
        // This means that the element at position (i, j) is equal to the element

        boolean Symetric = true;
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        //Checking if the matrix is symmetric
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    Symetric = false;
                    break;
                }
            }
            if (!Symetric) break;
        }
        if (Symetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
