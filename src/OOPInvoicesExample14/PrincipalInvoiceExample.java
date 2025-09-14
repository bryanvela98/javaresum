package OOPInvoicesExample14;
import java.util.Scanner;


public class PrincipalInvoiceExample {
    public static void main(String[] args) {
        
        Client client = new Client();
        client.setId("12345678");
        client.setName("Bryan");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter invoice description: ");
        String description = scanner.nextLine();
        Invoice invoice = new Invoice(description, client);
        
        Product product1;
        String name;
        Double price;
        int quantity;

        System.out.println();

        for(int i = 0; i<5; i++){
            product1 = new Product();
            System.out.println("Enter product number " + product1.getCode() + ": ");
            name = scanner.next();
            product1.setName(name);

            System.out.println("Enter product price: ");
            price = scanner.nextDouble();
            product1.setPrice(price);

            System.out.println("Enter quantity: ");
            quantity = scanner.nextInt();

            ItemInvoice item = new ItemInvoice(quantity, product1);
            invoice.addItemInvoice(item);

            System.out.println();
        }
        System.out.println(invoice.getDescription());
    }

}
