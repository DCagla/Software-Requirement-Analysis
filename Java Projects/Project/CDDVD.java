public class CDDVD extends OfficeSuppliesItem {
    private String[] content; // İçerikler veya şarkı listesi

    public CDDVD(String itemId, String name, double price, String brand, String manufacturer, String publicationDate, String coverTitle, String[] content) {
        super(itemId, name, price, brand, manufacturer, publicationDate, coverTitle);
        this.content = content;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    // CD-DVD bilgilerini görüntüleme 
    public void displayCDDVDInfo() {
        System.out.println("CD-DVD Item ID: " + getItemId() +
                           "\nName: " + getName() +
                           "\nPrice: " + getPrice() +
                           "\nBrand: " + getBrand() +
                           "\nManufacturer: " + getManufacturer() +
                           "\nPublication Date: " + getPublicationDate() +
                           "\nCover Title: " + getCoverTitle() +
                           "\nContent: " + String.join(", ", getContent()));
    }
}
