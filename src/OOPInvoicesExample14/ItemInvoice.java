package OOPInvoicesExample14;

public class ItemInvoice {
    private int quantity;
    private Product product;

    // Constructor
    public ItemInvoice(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double calculateAmount() {
        return this.quantity * this.product.getPrice();
    }
}
