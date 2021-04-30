public class Course {
    private int id;
    private String name;
    private double price;
    private Instructor creator;
    private double discount;

    public double getPriceAfterDiscount() {
        return this.price-(this.price * this.getDiscount() / 100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreator() {
        return creator.getFirstName().toString() + " " + creator.getLastName().toString();
    }

    public void setCreator(Instructor creator) {
        this.creator = creator;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
