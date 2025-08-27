package FlowControl4;

public class LabelInForOrWhile {
    public static void main(String[] args) {
        
        // Labelled for loop
        outerLoop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break outerLoop; // Break out of the outer loop when j is 3
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Labelled while loop
        int i = 0;
        outerWhileLoop: while (i < 5) {
            int j = 0;
            while (j < 5) {
                if (j == 3) {
                    break outerWhileLoop; // Break out of the outer while loop when j is 3
                }
                System.out.println("i: " + i + ", j: " + j);
                j++;
            }
            i++;
        }

        // Label works for break and continue statements, but not for return statements.
        // Labelling will help to break out of nested loops or switch statements.
        // It is not recommended to use labels unless necessary, as it can make the code harder to read and understand.
    }

}
