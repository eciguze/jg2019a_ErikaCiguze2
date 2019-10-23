package jg_lv;

public class Circle{
    double radius;

    public double setRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    double calculateArea(double radius){
        return 43.14*radius*radius;
    }
}