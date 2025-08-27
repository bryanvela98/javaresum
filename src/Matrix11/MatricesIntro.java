package Matrix11;

public class MatricesIntro {
    public static void main(String[] args) {
        // Matrices are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        // Its elements are associated with an index and can contain reference types or primitive types.

        // But always associated with a single type.
        // It allow to create recursive matrices and multidimensional matrices.

        // Declaration of a matrix
        // Syntax: dataType[][] matrixName; or dataType matrixName[][];
        int[][] myMatrix; // matrix of integers
        String[][] myStringMatrix; // matrix of strings
        double[][] myDoubleMatrix; // matrix of doubles
        
        // Instantiation of a matrix
        // Syntax: matrixName = new dataType[row][col];
        myMatrix = new int[3][4]; // 3 rows and 4 columns
        myStringMatrix = new String[2][5]; // 2 rows and 5 columns
        myDoubleMatrix = new double[4][3]; // 4 rows and 3 columns
        // Not only can instance primitive types, but also reference types

        // Size of row and column
        System.out.println("Rows in myMatrix: " + myMatrix.length); // prints 3
        System.out.println("Columns in myMatrix: " + myMatrix[0].length); // prints the length of the first row

        // Assignment of values to a matrix
        // Syntax: matrixName[row][col] = value;
        myMatrix[0][0] = 1; // assigns the value 1 to the first element of the first row
        myMatrix[0][1] = 2; // assigns the value 2 to the second element of the first row
        myMatrix[1][0] = 3; // assigns the value 3 to the first element of the second row
        myMatrix[2][2] = 4; // assigns the value 4 to the third element of the third row

        // Getting elements from a matrix
        int num1 = myMatrix[0][0]; // gets the value of the first element of the first row
        int num2 = myMatrix[1][0]; // gets the value of the first element of the second row
        int num3 = myMatrix[2][2]; // gets the value of the third element of the third row

        // To declarate, instance and initialize a matrix that size and values are known at compile time, you can use the following syntax:
        int[][] myStaticMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // creates a matrix of integers with 3 rows and 3 columns
    }
}
