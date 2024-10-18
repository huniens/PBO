public class Main {
    public static void main(String[] args) {
        // Membuat pasar dan penjual
        Market market = new Market("Traditional Market");

        Seller seller1 = new Seller("John's Vegetables");
        seller1.addProduct(new Product("Tomato", 1.5, 100));
        seller1.addProduct(new Product("Cucumber", 0.75, 50));

        Seller seller2 = new Seller("Sarah's Fruits");
        seller2.addProduct(new Product("Apple", 1.0, 200));
        seller2.addProduct(new Product("Banana", 0.5, 150));

        market.registerSeller(seller1);
        market.registerSeller(seller2);

        // Menampilkan daftar penjual dan produk
        market.listAllSellers();
        market.listAllProducts();

        // Membuat customer Hanin
        Customer hanin = new Customer("Hanin");

        // Membuat order untuk Hanin
        Order order1 = new Order("ORD001");

        // Hanin membeli produk dari penjual
        OrderItem orderItem1 = new OrderItem(new Product("Tomato", 1.5, 100), 3); // Membeli 3 tomat
        OrderItem orderItem2 = new OrderItem(new Product("Apple", 1.0, 200), 5);  // Membeli 5 apel

        // Menambahkan item ke order
        order1.addItem(orderItem1);
        order1.addItem(orderItem2);

        // Menambahkan order ke customer Hanin
        hanin.addOrder(order1);

        // Menampilkan detail order Hanin
        hanin.printOrders();
    }
}
