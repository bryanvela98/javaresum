package OOPInvoicesExample14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private int folio;
    private String description;
    private Date date;
    private Client client;
    private ItemInvoice[] items;
    private int indexItems;
    public static final int MAX_ITEMS = 10; // defining a constant for maximum items
    private static int lastFolio; // static variable to keep track of the last folio number

    // Constructor

    public Invoice(String description, Client client) {
        this.description = description;
        this.client = client;
        this.items = new ItemInvoice[MAX_ITEMS]; // Assuming a maximum of 10 items per invoice
        this.date = new Date(); // Set the invoice date to the current date
        this.indexItems = 0; // Initialize the index for items
        this.folio = ++lastFolio; // Auto-increment folio number
    }

    public int getFolio() {
        return folio;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public ItemInvoice[] getItems() {
        return items;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Function to add item invoices
    public void addItemInvoice(ItemInvoice item) {
        if (indexItems < MAX_ITEMS) {
            this.items[indexItems++] = item;
        }
    }

    public Double calculateTotal() {
        Double total = 0.0;
        for (ItemInvoice item : this.items) {
            if (item == null) break; // Stop if we reach a null item
            total += item.calculateAmount();
        }
        return total;
    }

    public String seeDetail() {
        StringBuilder sb = new StringBuilder("Invoice No.: " );
        sb.append(folio)
          .append("\nClient: ")
          .append(this.client.getName())
          .append("\nid: ")
          .append(this.client.getId())
          .append("\nDescription: ").append(this.description)
          .append("\n")
          .append("\n#\tName\t$\tQty\tTotal\n");
        
          // Adding date correctly formatted
          SimpleDateFormat df = new SimpleDateFormat("dd 'of' MMMM, yyyy");
          sb.append("Date: ").append(df.format(this.date)).append("\n");

        // Loop through items to add their details
        for (ItemInvoice item : this.items) {
            if (item == null) break; // Stop if we reach a null item
            sb.append(item.getProduct().getCode())
              .append("\t")
              .append(item.getProduct().getName())
              .append("\t")
              .append(item.getProduct().getPrice())
              .append("\t")
              .append(item.getQuantity())
              .append("\t")
              .append(item.calculateAmount())
              .append("\n");
        }
        sb.append("\nGrand Total: $").append(this.calculateTotal());
        return sb.toString();
    }
}
