package jg_lv.HomeWork;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Oranges");
        product.setRegularPrice(1.89);
        product.setDiscount(15);

        String productName = product.getName();
        double productRegularPrice = product.getRegularPrice();
        double productDiscount = product.getDiscount();

        System.out.println("This is " + productName);
        System.out.println("Price is " + productRegularPrice + " EUR");
        System.out.println("This product has " + productDiscount + "%, and now it costs EUR 1.61" );
    }
}
