public class Laptop extends Computer {
    private boolean hasHdmiSupport; // HDMI desteği var mı?

    public Laptop(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption, String operatingSystem, String cpuType, int ramCapacity, int hddCapacity, boolean hasHdmiSupport) {
        super(itemId, name, price, brand, manufacturer, maxInputVoltage, powerConsumption, operatingSystem, cpuType, ramCapacity, hddCapacity);
        this.hasHdmiSupport = hasHdmiSupport;
    }


    public boolean hasHdmiSupport() {
        return hasHdmiSupport;
    }

    public void setHdmiSupport(boolean hasHdmiSupport) {
        this.hasHdmiSupport = hasHdmiSupport;
    }

    // Laptop bilgilerini görüntüleme
    public void displayLaptopInfo() {
        System.out.println("Laptop Computer Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nOperating System: " + getOperatingSystem() + "\nCPU Type: " + getCpuType() + "\nRAM Capacity: " + getRamCapacity() + " GB\nHDD Capacity: " + getHddCapacity() + " GB\nHDMI Support: " + (hasHdmiSupport ? "Yes" : "No"));
    }
}
