public class ElectronicItem extends Item {
    private int maxInputVoltage;
    private int powerConsumption;

    public ElectronicItem(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption) {
        super(itemId, name, price, brand, manufacturer);
        this.maxInputVoltage = maxInputVoltage;
        this.powerConsumption = powerConsumption;
    }


    public int getMaxInputVoltage() {
        return maxInputVoltage;
    }

    public void setMaxInputVoltage(int maxInputVoltage) {
        this.maxInputVoltage = maxInputVoltage;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    // Elektronik ürün bilgilerini görüntüleme 
    public void displayElectronicInfo() {
        System.out.println("Electronic Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nMax Input Voltage: " + maxInputVoltage + "V\nPower Consumption: " + powerConsumption + "W");
    }

}
