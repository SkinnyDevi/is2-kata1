package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person johnDoe = new Person(
                "John Doe",
                LocalDate.of(2002, 3, 19),
                new PhoneNumber(34, 987654321)
        );
        System.out.println(johnDoe);
    }
}
