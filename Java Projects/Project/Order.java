import java.util.HashMap;
import java.util.Map;

public class Order {
    private String orderDate;
    private String customerID;
    private double totalCost;
    private Map<String, Integer> itemsPurchased;

    public Order(String orderDate, String customerID, ShoppingCart shoppingCart) {
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.totalCost = shoppingCart.calculateTotal();
        this.itemsPurchased = new HashMap<>(shoppingCart.getItems());
    }

    private double calculateTotalCost(ShoppingCart cart) {
        double total = 0.0;
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Date: ").append(orderDate)
          .append(", Customer ID: ").append(customerID)
          .append(", Total Cost: ").append(totalCost)
          .append(", Items Purchased: ");
        itemsPurchased.forEach((item, quantity) -> sb.append("\n").append(item).append(" - Quantity: ").append(quantity));
        return sb.toString();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Map<String, Integer> getItemsPurchased() {
        return itemsPurchased;
    }
}
