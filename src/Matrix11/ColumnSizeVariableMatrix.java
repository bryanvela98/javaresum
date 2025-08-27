package Matrix11;

public class ColumnSizeVariableMatrix {
    public static void main(String[] args) {
        // To create a matrix with variable column sizes, you can use an array of arrays.
        // This allows each row to have a different number of columns.
        // Declaration of a variable column size matrix
        int[][] variableColumnMatrix = new int[3][]; // 3 rows, but columns are not defined yet

        // Instantiation of each row with different column sizes
        variableColumnMatrix[0] = new int[2]; // first row has 2
        variableColumnMatrix[1] = new int[3]; // second row has 3
        variableColumnMatrix[2] = new int[1]; // third row has 1

        // Assignment of values to the variable column size matrix with for loop
        for (int i = 0; i < variableColumnMatrix.length; i++) {
            for (int j = 0; j < variableColumnMatrix[i].length; j++) {
                System.out.println(variableColumnMatrix[i][j] + "\t");
                variableColumnMatrix[i][j] = i + j; // assigning values based on row and column indices
            }
            System.out.println();
        }
    }
}
