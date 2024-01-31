public class TV extends ElectronicItem {
    private int screenSize; // Ekran boyutu (inç)

    public TV(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption, int screenSize) {
        super(itemId, name, price, brand, manufacturer, maxInputVoltage, powerConsumption);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    // TV bilgilerini görüntüleme 
    public void displayTVInfo() {
        System.out.println("TV Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nMax Input Voltage: " + getMaxInputVoltage() + "V\nPower Consumption: " + getPowerConsumption() + "W\nScreen Size: " + screenSize + "\"");
    }
}
