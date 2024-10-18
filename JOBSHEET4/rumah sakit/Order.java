import java.util.ArrayList;

public class Order {
    private String orderId;
    private ArrayList<OrderItem> orderItems;

    // Constructor untuk membuat Order baru dengan ID
    public Order(String orderId) {
        this.orderId = orderId;
        this.orderItems = new ArrayList<>(); // Inisialisasi ArrayList
    }

    // Menambahkan item ke order
    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    // Menghitung total harga semua item dalam order
    public double getTotalAmount() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getSubtotal(); // Menambahkan subtotal setiap item ke total
        }
        return total;
    }

    // Mendapatkan ID Order
    public String getOrderId() {
        return orderId;
    }

    // Menampilkan semua item dalam order
    public void listOrderItems() {
        System.out.println("Items in Order ID: " + orderId);
        for (OrderItem item : orderItems) {
            System.out.println(item.getProduct().getProductName() + " - Quantity: " + item.getQuantity() +
                    " - Subtotal: $" + item.getSubtotal());
        }
        System.out.println(); // Tambahkan spasi antara pesanan
    }
}
