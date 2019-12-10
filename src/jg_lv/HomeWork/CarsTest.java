package jg_lv.HomeWork;

public class CarsTest {
    public static void main(String[] args) {
        Cars cars = new Cars();
        CarSeller seller = new CarSeller();
        CarsAdministrator administrator = new CarsAdministrator();
        cars.redCar();
        cars.readAboutACar();
        seller.redCar();
        seller.readAboutACar();
        seller.addNewCar();
        administrator.redCar();
        administrator.readAboutACar();
        administrator.addNewCar();
        administrator.addANewCarColor();
    }
}
