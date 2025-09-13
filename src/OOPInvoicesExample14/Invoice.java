package OOPInvoicesExample14;

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
}
