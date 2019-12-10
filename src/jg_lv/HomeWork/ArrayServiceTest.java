package jg_lv.HomeWork;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[]array=service.createArray(10);
        service.fillArrayWithRandomNumber(array);
        service.sumInArray(array);
    }
}
