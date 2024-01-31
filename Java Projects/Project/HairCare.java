public class HairCare extends CosmeticItem {
    private boolean isMedicated; // Ürünün ilaçlı olup olmadığı

    public HairCare(String itemId, String name, double price, String brand, String manufacturer, String expirationDate, double weight, boolean isOrganic, boolean isMedicated) {
        super(itemId, name, price, brand, manufacturer, expirationDate, weight, isOrganic);
        this.isMedicated = isMedicated;
    }


    public boolean isMedicated() {
        return isMedicated;
    }

    public void setMedicated(boolean isMedicated) {
        this.isMedicated = isMedicated;
    }

    // Saç bakım ürünü bilgilerini görüntüleme 
    public void displayHairCareInfo() {
        System.out.println("Hair Care Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nExpiration Date: " + getExpirationDate() + "\nWeight: " + getWeight() + " kg\nOrganic: " + (isOrganic() ? "Yes" : "No") + "\nMedicated: " + (isMedicated ? "Yes" : "No"));
    }
}
