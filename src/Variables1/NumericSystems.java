package Variables1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumericSystems {
    public static void main(String[] args) {
        
        int decimalNumber = 10; // Decimal (base 10)
        int binaryNumber = 0b1010; // Binary (base 2)
        int octalNumber = 012; // Octal (base 8)
        int hexadecimalNumber = 0xA; // Hexadecimal (base 16)
        // The prefix '0b' indicates binary, '0' indicates octal, and '0x' indicates hexadecimal.

        //Converting NumericSystems to Strings
        String decimalToBinary = Integer.toBinaryString(decimalNumber);
        String decimalToOctal = Integer.toOctalString(decimalNumber);
        String decimalToHexadecimal = Integer.toHexString(decimalNumber);
        String binaryToDecimal = Integer.toString(binaryNumber, 10);

        //Data entry by dialog screen
        String numDeci= JOptionPane.showInputDialog(null, "Enter a number"); //showInputDialog is a method of JOptionPane class that shows a dialog box to the user and returns the input as a string.
        int numDeciInt = Integer.parseInt(numDeci); //Convert the string to int
        JOptionPane.showMessageDialog(null, numDeciInt); //showMessageDialog is a method of JOptionPane class that shows a dialog box with the message.

        //Data entry by terminal
        Scanner scanner = new Scanner(System.in); //Scanner is a class that allows us to read input from various sources, including the keyboard.
        System.out.print("Enter a number: "); //Prints a message to the console.
        //String numDeci2 = scanner.nextLine(); //Reads a line of text from the console.
        int numDeci2 = scanner.nextInt(); //Reads an integer from the console.
    }

}
