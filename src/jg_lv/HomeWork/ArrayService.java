package jg_lv.HomeWork;

import java.util.Random;

public class ArrayService {
    public int[] createArray(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumber(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void sumInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("Sum " + sum);
        }
    }
}
