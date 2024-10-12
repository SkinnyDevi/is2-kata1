package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int DaysPerYear = 365;
    private final String name;
    private final LocalDate birthday;
    private final PhoneNumber phoneNumber;

    public Person(String name, LocalDate birthday, PhoneNumber phoneNumber) {
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days) / DaysPerYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
