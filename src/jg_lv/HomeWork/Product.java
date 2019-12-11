package jg_lv.HomeWork;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    //metode parametra nosaukums nav labs, drošvien domaji "regularPrice"
    public void setRegularPrice(double v) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
