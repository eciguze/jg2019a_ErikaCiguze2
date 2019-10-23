package jg_lv.HomeWork;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();

        car.setColor("Dark blue");
        car.setManufacturer("Audi");
        car.setYear(2018);

        String carColor = car.getColor();
        String carManufacturer=car.getManufacturer();
        int carYear=car.getYear();

        System.out.println("Car is in " + carColor + " color");
        System.out.println("This car is " + carManufacturer);
        System.out.println("Car was made in " + carYear + " year ");
    }
}
