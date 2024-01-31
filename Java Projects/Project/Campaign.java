import java.util.Date;

public class Campaign {
    private Date startDate;
    private Date endDate;
    private String itemType;
    private double discountRate;

    public Campaign(Date startDate, Date endDate, String itemType, double discountRate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.itemType = itemType;
        this.discountRate = discountRate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Kampanya bilgilerini görüntüleme
    public void displayCampaignInfo() {
        System.out.println("Campaign Start Date: " + startDate +
                           "\nEnd Date: " + endDate +
                           "\nItem Type: " + itemType +
                           "\nDiscount Rate: " + discountRate + "%");
    }

}
