import java.util.ArrayList;

public class Market {
    private String name;
    private ArrayList<Seller> sellers;

    public Market(String name) {
        this.name = name;
        this.sellers = new ArrayList<>();
    }

    public void registerSeller(Seller seller) {
        sellers.add(seller);
    }

    public void listAllSellers() {
        for (Seller seller : sellers) {
            System.out.println(seller.getName());
        }
    }

    public Seller findSellerByName(String name) {
        for (Seller seller : sellers) {
            if (seller.getName().equalsIgnoreCase(name)) {
                return seller;
            }
        }
        return null; // Seller not found
    }

    public void listAllProducts() {
        for (Seller seller : sellers) {
            System.out.println("Products from " + seller.getName() + ":");
            seller.listProducts();
        }
    }
}
