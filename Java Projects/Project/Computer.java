public class Computer extends ElectronicItem {
    private String operatingSystem;
    private String cpuType;
    private int ramCapacity; // GB cinsinden
    private int hddCapacity; // GB cinsinden

    public Computer(String itemId, String name, double price, String brand, String manufacturer, int maxInputVoltage, int powerConsumption, String operatingSystem, String cpuType, int ramCapacity, int hddCapacity) {
        super(itemId, name, price, brand, manufacturer, maxInputVoltage, powerConsumption);
        this.operatingSystem = operatingSystem;
        this.cpuType = cpuType;
        this.ramCapacity = ramCapacity;
        this.hddCapacity = hddCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    // Bilgisayar bilgilerini görüntüleme
    public void displayComputerInfo() {
        System.out.println("Computer Item ID: " + getItemId() + "\nName: " + getName() + "\nPrice: " + getPrice() + "\nBrand: " + getBrand() + "\nManufacturer: " + getManufacturer() + "\nOperating System: " + operatingSystem + "\nCPU Type: " + cpuType + "\nRAM Capacity: " + ramCapacity + " GB\nHDD Capacity: " + hddCapacity + " GB");
    }

}
