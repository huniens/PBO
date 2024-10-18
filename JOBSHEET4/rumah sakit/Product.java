public class Product {
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void updateStock(int amount) {
        this.stock += amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
