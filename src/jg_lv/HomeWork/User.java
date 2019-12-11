package jg_lv.HomeWork;

public class User {
    private String name;
    private String lastName;
    int age;

    public User(String name, String lastName, int age) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Name was written wrong");
        }
        this.name = name;

        if (!isValidLastName(lastName)) {
            throw new IllegalArgumentException("Last Name was written wrong");
        }
        this.lastName = lastName;

        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Age was written wrong");
        }
        this.age = age;
    }

    private boolean isValidName(String name) {
        return name.length() >= 3 && name.length() <= 15;
    }

    private boolean isValidLastName(String lastName) {
        return lastName.length() >= 3 && lastName.length() <= 15;
    }

    private boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }
}
