package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    public static final int DaysPerYear = 365;
    private final String name;
    private final int phoneNumber;
    private final LocalDate birthday;

    public Person(String name, int phoneNumber, LocalDate birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", birthday=" + birthday +
                '}';
    }

    private int toYears(long days) {
        return (int) days / DaysPerYear;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}