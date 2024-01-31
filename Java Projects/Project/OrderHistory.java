// OrderHistory.java
import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<Order> orders;

    public OrderHistory() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Order history is empty.");
        } else {
            System.out.println("Order History:");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }


    // Order sınıfındaki siparişlerin detaylarını alma
    public List<Order> getOrders() {
        return orders;
    }
}
