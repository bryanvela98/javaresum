package OOPInvoicesExample14;

import java.util.Date;

public class Invoice {
    private int folio;
    private String description;
    private Date date;
    private Client client;

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

    public void setFolio(int folio) {
        this.folio = folio;
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

}
