import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void printOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + " | Total: $" + order.getTotalAmount());
            order.listOrderItems(); // Menampilkan item yang dipesan
        }
    }

    public String getName() {
        return name;
    }
}
