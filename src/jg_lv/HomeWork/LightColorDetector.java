package jg_lv.HomeWork;

public class LightColorDetector {
    private int wavelength;

    public void isDetected(int wavelength) {
        if ((wavelength <= 350) && (wavelength < 450)) {
            System.out.println("Violeta krāsa");
        } else if ((wavelength <= 450) && (wavelength < 495)) {
            System.out.println("Zila krāsa");
        } else if ((wavelength <= 495) && (wavelength < 570)) {
            System.out.println("Zaļa krāsa");
        } else if ((wavelength <= 570) && (wavelength < 590)) {
            System.out.println("Dzeltena krāsa");
        } else if ((wavelength <= 590) && (wavelength < 620)) {
            System.out.println("Oranža krāsa");
        } else if ((wavelength <= 620) && (wavelength < 750)) {
            System.out.println("Sarkana krāsa");
        } else {
            System.out.println("Nav izdevies noteikt krāsu! ");
        }
    }

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }
}

