public class Item {
    private String itemId;
    private String name;
    private double price;
    private String brand;
    private String manufacturer;

    public Item(String itemId, String name, double price, String brand, String manufacturer) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.manufacturer = manufacturer;
    }
    
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    // Ürün bilgilerini görüntüleme
    public void displayItemInfo() {
        System.out.println("Item ID: " + itemId + "\nName: " + name + "\nPrice: " + price + "\nBrand: " + brand + "\nManufacturer: " + manufacturer);
    }
}
