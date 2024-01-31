public class Tablet extends Computer {
    private String dimensions; // Tablet boyutları

    public Tablet(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption, String operatingSystem, String cpuType, int ramCapacity, int hddCapacity, String dimensions) {
        super(itemId, name, price, brand, manufacturer, maxInputVoltage, powerConsumption, operatingSystem, cpuType, ramCapacity, hddCapacity);
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    // Tablet bilgilerini görüntüleme
    public void displayTabletInfo() {
        System.out.println("Tablet Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nOperating System: " + getOperatingSystem() + "\nCPU Type: " + getCpuType() + "\nRAM Capacity: " + getRamCapacity() + " GB\nHDD Capacity: " + getHddCapacity() + " GB\nDimensions: " + dimensions);
    }
}
