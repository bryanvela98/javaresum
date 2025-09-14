package OOPInvoicesExample14;

public class Product {
    private int code;
    private String name;
    private Double price;
    private static int lastCode; // static variable to keep track of the last code number

    // Constructor
    
    public Product() {
        this.code = ++lastCode; // Auto-increment code number
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
