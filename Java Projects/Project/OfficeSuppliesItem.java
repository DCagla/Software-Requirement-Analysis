public class OfficeSuppliesItem extends Item {
    private String publicationDate;
    private String coverTitle;

    public OfficeSuppliesItem(String itemId, String name, double price, String brand, String manufacturer, String publicationDate, String coverTitle) {
        super(itemId, name, price, brand, manufacturer);
        this.publicationDate = publicationDate;
        this.coverTitle = coverTitle;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCoverTitle() {
        return coverTitle;
    }

    public void setCoverTitle(String coverTitle) {
        this.coverTitle = coverTitle;
    }

    // Ofis malzemesi bilgilerini görüntüleme 
    public void displayOfficeSuppliesInfo() {
        System.out.println("Office Supplies Item ID: " + getItemId() +
                           "\nName: " + getName() +
                           "\nPrice: " + getPrice() +
                           "\nBrand: " + getBrand() +
                           "\nManufacturer: " + getManufacturer() +
                           "\nPublication Date: " + publicationDate +
                           "\nCover Title: " + coverTitle);
    }
}
