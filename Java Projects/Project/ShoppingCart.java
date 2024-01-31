import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> items;
    private Map<String, Double> itemPrices;

    public ShoppingCart() {
        items = new HashMap<>();
        itemPrices = new HashMap<>();
    }

    public void addItem(String itemName, int quantity, double price) {
        items.put(itemName, items.getOrDefault(itemName, 0) + quantity);
        itemPrices.putIfAbsent(itemName, price); 
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void removeItem(String itemName, int quantity) {
        int currentQuantity = items.getOrDefault(itemName, 0);
        if (currentQuantity <= quantity) {
            items.remove(itemName);
            itemPrices.remove(itemName);
        } else {
            items.put(itemName, currentQuantity - quantity);
        }
    }

    // Alışveriş sepetini gösteren 
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Alışveriş sepeti boş.");
        } else {
            System.out.println("Alışveriş Sepeti:");
            items.forEach((key, value) -> System.out.println(key + " - Miktar: " + value));
        }
    }

    // Alışveriş sepetini temizleme 
    public void clear() {
        items.clear();
    }

    public double calculateTotal() {
        double total = 0;
        for (String item : items.keySet()) {
            total += itemPrices.get(item) * items.get(item);
        }
        return total;
    }
}
