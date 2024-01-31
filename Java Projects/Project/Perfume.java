public class Perfume extends CosmeticItem {
    private int longevityHours; // Parfümün kalıcılık süresi

    public Perfume(String itemId, String name, double price, String brand, String manufacturer, String expirationDate, double weight, boolean isOrganic, int longevityHours) {
        super(itemId, name, price, brand, manufacturer, expirationDate, weight, isOrganic);
        this.longevityHours = longevityHours;
    }


    public int getLongevityHours() {
        return longevityHours;
    }

    public void setLongevityHours(int longevityHours) {
        this.longevityHours = longevityHours;
    }

    // Parfüm bilgilerini görüntüleme 
    public void displayPerfumeInfo() {
        System.out.println("Perfume Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nExpiration Date: " + getExpirationDate() + "\nWeight: " + getWeight() + " kg\nOrganic: " + (isOrganic() ? "Yes" : "No") + "\nLongevity: " + longevityHours + " hours");
    }
}
