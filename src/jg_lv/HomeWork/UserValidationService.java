package jg_lv.HomeWork;

public class UserValidationService {
    public static void main(String[] args) {
        shouldCreateUser();
        shouldFailIfInputValueToSmall();
        shouldFailIfInputValueToLarge();
    }

    private static void shouldCreateUser() {
        User user = new User("Laura", "Saule", 22);
    }

    private static void shouldFailIfInputValueToSmall() {
        System.out.println("=============");
        boolean result = false;
        try {
            User user = new User("L", "Saule", 2);
        } catch (IllegalArgumentException ex) {
            result = true;
        }
        System.out.println("Test: shouldFailIfInputValueToSmall");
        System.out.println(result ? "SUCCESS" : "FAILED");
    }

    private static void shouldFailIfInputValueToLarge() {
        System.out.println("=======================");
        boolean result = false;
        try {
            User user = new User("Laura", "Saule121212", 2345);
        } catch (IllegalArgumentException ex) {
            result = true;
        }
        System.out.println("Test: shouldFailIfInputValueToLarge");
        System.out.println(result ? "SUCCESS" : "FAILED");
    }
}