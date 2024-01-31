public class Desktop extends Computer {
    private String boxColor; // Masaüstü bilgisayarın kutu rengi

    public Desktop(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption, String operatingSystem, String cpuType, int ramCapacity, int hddCapacity, String boxColor) {
        super(itemId, name, price, brand, manufacturer, maxInputVoltage, powerConsumption, operatingSystem, cpuType, ramCapacity, hddCapacity);
        this.boxColor = boxColor;
    }


    public String getBoxColor() {
        return boxColor;
    }

    public void setBoxColor(String boxColor) {
        this.boxColor = boxColor;
    }

    // Masaüstü bilgisayar bilgilerini görüntüleme 
    public void displayDesktopInfo() {
        System.out.println("Desktop Computer Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nOperating System: " + getOperatingSystem() + "\nCPU Type: " + getCpuType() + "\nRAM Capacity: " + getRamCapacity() + " GB\nHDD Capacity: " + getHddCapacity() + " GB\nBox Color: " + boxColor);
    }

}
