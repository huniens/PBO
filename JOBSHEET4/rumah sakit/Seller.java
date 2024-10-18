import java.util.ArrayList;

public class Seller {
    private String name;
    private ArrayList<Product> products;

    public Seller(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product.getProductName() + " - Price: " + product.getPrice());
        }
    }

    public String getName() {
        return name;
    }
}
