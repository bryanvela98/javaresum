package Variables1;
import java.util.Scanner;

public class PracticeExample_InvoiceDetail {
    public static void main(String[] args) {
        /* The task consists of creating a new class using a main method called InvoiceDetail. 
        It requires developing a program that receives invoice data using the Scanner class as follows:
        1. To receive the invoice name or description, use the nextLine() method to obtain the invoice name with spaces.
        2. Receive two double product prices, use the nextDouble() method to obtain prices with decimals (,).
        3. Calculate the total, add both prices and add a 19% tax.

        The request is to display the invoice name, the total gross amount (before tax), the tax, and the total net amount including tax in a single String.

        For example, the result could be something like this:

        The office product invoice has a gross total of 134.78, with a tax of 25.6082, and the amount after tax is 160.3882. */

        // Solution

        // Importing Scanner class for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user for invoice name
        System.out.print("Enter the invoice name: ");
        String invoiceName = scanner.nextLine(); // Reading invoice name with spaces
        
        // Prompting user for product prices
        System.out.print("Enter the first product price: ");
        double productPrice1 = scanner.nextDouble(); // Reading first product price

        System.out.print("Enter the second product price: ");
        double productPrice2 = scanner.nextDouble(); // Reading second product price

        // Calculating total gross amount (before tax)
        double totalGross = productPrice1 + productPrice2; // Adding both prices

        // Calculating tax (19%)
        double tax = totalGross * 0.19;

        // Calculating total net amount (after tax)
        double totalNet = totalGross + tax;

        // Displaying the invoice details
        String result = String.format("The %s invoice has a gross total of %.2f, with a tax of %.4f, and the amount after tax is %.4f.",
                invoiceName, totalGross, tax, totalNet); // Formatting the output string
        System.out.println(result); // Printing the result
    }
}
