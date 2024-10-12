package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002, 3, 19);
        ContactDetails contactDetails = new ContactDetails(
                "John Doe",
                new ContactAddress("C/ Las Palmas", null, "35002"),
                new PhoneNumber(34, 987654321)
        );
        Person johnDoe = new Person(
                birthday,
                contactDetails
        );
        System.out.println(johnDoe);
    }
}
