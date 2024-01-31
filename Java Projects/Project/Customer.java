public class Customer extends Person {
    private String customerId;
    private String password;
    private double balance;
    private String status; // CLASSIC, SILVER, GOLDEN
    private ShoppingCart shoppingCart;
    private OrderHistory orderHistory;
    
    
    public Customer(String name, String email, String birthDate, String customerId, String password, double balance, String status) {
        super(name, email, birthDate);
        this.customerId = customerId;
        this.password = password;
        this.balance = balance;
        this.status = status;
        this.shoppingCart = new ShoppingCart();
        this.orderHistory = new OrderHistory();
    }
    
    // Alışveriş sepetine ürün ekleme
    public void addItemToCart(Item item, int quantity) {
        shoppingCart.addItem(item.getName(), quantity);
        System.out.println("Added " + quantity + " of " + item.getName() + " to the shopping cart.");
    }

    // Alışveriş sepetinden ürün çıkarma
    public void removeFromCart(String itemName, int quantity) {
        shoppingCart.removeItem(itemName, quantity);
        System.out.println("Removed " + quantity + " of " + itemName + " from the shopping cart.");
    }

    // Alışveriş sepetini görüntüleme
    public void viewCart() {
        shoppingCart.displayItems();
    }
    
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     // Şifre değiştirme
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password changed successfully.");
    }

    // Bakiye güncelleme 
    public void updateBalance(double amount) {
        this.balance += amount;
        System.out.println("Balance updated. New balance: " + balance);
    }

    // Aktif kampanyaları görüntüleme 
    public void viewActiveCampaigns() {
        System.out.println("Displaying active campaigns...");
    }

    // Alışveriş sepetine ürün ekleme
    public void addItemToCart(Item item) {
        shoppingCart.addItem(item.getName(), 1);
        System.out.println("Item added to shopping cart.");
    }

    // Alışveriş sepetini temizleme 
    public void clearShoppingCart() {
        shoppingCart.clear();
        System.out.println("Shopping cart cleared.");
    }

    // Sipariş verme 
    public void placeOrder(String password) {
    if (this.password.equals(password)) {
        Order newOrder = new Order(shoppingCart); // Yeni sipariş nesnesi oluşturulur
        orderHistory.addOrder(newOrder); // Sipariş, sipariş geçmişine ekleniyor
        shoppingCart.clear(); // Alışveriş sepeti temizleniyor
        System.out.println("Order placed successfully.");
    } else {
        System.out.println("Incorrect password. Order not placed.");
    }
}

    // Müşteri bilgilerini toString metodu ile görüntüleme
    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\nName: " + getName() + "\nEmail: " + getEmail() + "\nDate of Birth: " + getBirthDate() + "\nBalance: " + balance + "\nStatus: " + status;
    }
}
