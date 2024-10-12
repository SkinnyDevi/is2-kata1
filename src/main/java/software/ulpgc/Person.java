package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int DaysPerYear = 365;
    private final LocalDate birthday;
    private final ContactDetails contactDetails;

    public Person(LocalDate birthday, ContactDetails contactDetails) {
        this.birthday = birthday;
        this.contactDetails = contactDetails;
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
                "birthday=" + birthday +
                ", contactDetails=" + contactDetails +
                '}';
    }

    public String getName() {
        return contactDetails.getName();
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public PhoneNumber getPhoneNumber() {
        return contactDetails.getPhoneNumber();
    }
}
