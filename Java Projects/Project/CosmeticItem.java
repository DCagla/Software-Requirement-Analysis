public class CosmeticItem extends Item {
    private String expirationDate;
    private double weight;
    private boolean isOrganic;

    public CosmeticItem(String itemId, String name, double price, String brand, String manufacturer, String expirationDate, double weight, boolean isOrganic) {
        super(itemId, name, price, brand, manufacturer);
        this.expirationDate = expirationDate;
        this.weight = weight;
        this.isOrganic = isOrganic;
    }


    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }

    // Kozmetik ürün bilgilerini görüntüleme 
    
    public void displayCosmeticInfo() {
    System.out.println("Cosmetic Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nExpiration Date: " + expirationDate + "\nWeight: " + weight + " kg\nOrganic: " + (isOrganic ? "Yes" : "No"));
    }
}
