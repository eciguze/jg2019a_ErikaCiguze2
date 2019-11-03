package jg_lv.HomeWork;

import java.util.Scanner;

//OK
public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius: ");
        double number = scanner.nextDouble();

        double result = circle.calculateArea(number);

        System.out.println("Circle area is:" + result);

    }
}
