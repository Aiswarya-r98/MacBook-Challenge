import java.util.Date;

public class Product {
    private String name; // Macbook pro
    private double price; //159.9
    private ProductType type;
    private Date warrantyExpriyDate;

    public Product() {
    }

    public Product(String name, double price, ProductType type, Date warrantyExpriyDate) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.warrantyExpriyDate = warrantyExpriyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Date getWarrantyExpriyDate() {
        return warrantyExpriyDate;
    }

    public void setWarrantyExpriyDate(Date warrantyExpriyDate) {
        this.warrantyExpriyDate = warrantyExpriyDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", warrantyExpriyDate=" + warrantyExpriyDate +
                '}';
    }


}
