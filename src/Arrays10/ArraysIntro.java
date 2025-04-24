package Arrays10;

public class ArraysIntro {
    public static void main(String[] args) {
            // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    // Its elements are associated with an index and can cointain reference types or primitive types.
    // But always associated with a single type.

    // Declaration of an array
    // Syntax: dataType[] arrayName; or dataType arrayName[];
    int[] myArray; // array of integers
    String[] myStringArray; // array of strings
    double[] myDoubleArray; // array of doubles

    // Instantiation of an array
    // Syntax: arrayName = new dataType[size];
    int[] myArray2 = new int[5]; // creates an array of integers with size 5   
    String[] myStringArray2 = new String[10]; // creates an array of strings with size 10
    double[] myDoubleArray2 = new double[3]; // creates an array of doubles with size 3

    // Assignment of values to an array
    // Syntax: arrayName[index] = value;
    myArray2[0] = 10; // assigns the value 10 to the first element of the array
    myArray2[1] = 20; // assigns the value 20 to the second element of the array
    myArray2[2] = 30; // assigns the value 30 to the third element of the array


    }
}

