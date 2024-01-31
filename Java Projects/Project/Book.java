public class Book extends OfficeSuppliesItem {
    private String publisher;
    private String[] authors;
    private int numberOfPages;

    public Book(String itemId, String name, double price, String brand, String manufacturer, String publicationDate, String coverTitle, String publisher, String[] authors, int numberOfPages) {
        super(itemId, name, price, brand, manufacturer, publicationDate, coverTitle);
        this.publisher = publisher;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Kitap bilgilerini görüntüleme
    public void displayBookInfo() {
        System.out.println("Book Item ID: " + getItemId() +
                           "\nName: " + getName() +
                           "\nPrice: " + getPrice() +
                           "\nBrand: " + getBrand() +
                           "\nManufacturer: " + getManufacturer() +
                           "\nPublication Date: " + getPublicationDate() +
                           "\nCover Title: " + getCoverTitle() +
                           "\nPublisher: " + getPublisher() +
                           "\nAuthors: " + String.join(", ", getAuthors()) +
                           "\nNumber of Pages: " + getNumberOfPages());
    }
}
