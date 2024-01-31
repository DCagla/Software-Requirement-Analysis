public class SmartPhone extends ElectronicItem {
    private String screenType; // Ekran tipi

    public SmartPhone(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption, String screenType) {
        super(itemId, name, price, brand, manufacturer, maxInputVoltage, powerConsumption);
        this.screenType = screenType;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    // Akıllı telefon bilgilerini görüntüleme 
    public void displaySmartPhoneInfo() {
        System.out.println("SmartPhone Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nMax Input Voltage: " + getMaxInputVoltage() + "V\nPower Consumption: " + getPowerConsumption() + "W\nScreen Type: " + screenType);
    }
}
