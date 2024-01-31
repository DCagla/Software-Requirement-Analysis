public class SkinCare extends CosmeticItem {
    private boolean isBabySensitive; // Ürünün bebek hassasiyetine uygun olup olmadığı

    public SkinCare(String itemId, String name, double price, String brand, String manufacturer, String expirationDate, double weight, boolean isOrganic, boolean isBabySensitive) {
        super(itemId, name, price, brand, manufacturer, expirationDate, weight, isOrganic);
        this.isBabySensitive = isBabySensitive;
    }

    public boolean isBabySensitive() {
        return isBabySensitive;
    }

    public void setBabySensitive(boolean isBabySensitive) {
        this.isBabySensitive = isBabySensitive;
    }

    // Cilt bakım ürünü bilgilerini görüntüleme
    public void displaySkinCareInfo() {
        System.out.println("Skin Care Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nExpiration Date: " + getExpirationDate() + "\nWeight: " + getWeight() + " kg\nOrganic: " + (isOrganic() ? "Yes" : "No") + "\nBaby Sensitive: " + (isBabySensitive ? "Yes" : "No"));
    }
}
