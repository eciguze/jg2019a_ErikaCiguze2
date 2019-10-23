package jg_lv.HomeWork;

public class Circle{
    double radius;

    public double setRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    double calculateArea(double radius){
        return 3.14*radius*radius;
    }
}