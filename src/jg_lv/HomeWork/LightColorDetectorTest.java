package jg_lv.HomeWork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wavelength from 380 to 750: ");
        int length = scanner.nextInt();

        LightColorDetector lightColorDetector = new LightColorDetector();
        String detect = lightColorDetector.detect(length);
        System.out.println("Light color is " + detect);

    }
}
