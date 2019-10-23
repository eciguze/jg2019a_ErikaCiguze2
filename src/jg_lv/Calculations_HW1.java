package jg_lv;

import java.util.Random;

public class Calculations_HW1 {
        public static void main(String[] args) {
            Random randomGenerator = new Random();
            double firstUnit = randomGenerator.nextInt(75);
            double secondUnit = randomGenerator.nextInt(60);

            double sum = firstUnit + secondUnit;
            double subtract = firstUnit - secondUnit;
            double multiply = firstUnit + secondUnit;
            double div = firstUnit / secondUnit;

            System.out.println("First Unit:  " + firstUnit);
            System.out.println("Second Unit:  " + secondUnit);

            System.out.println("Sum Result:  " + sum);
            System.out.println("Subtract Result:  " + subtract);
            System.out.println("Multiply Result:  " + multiply);
            System.out.println("Divide Result:  " + div);
        }
    }

