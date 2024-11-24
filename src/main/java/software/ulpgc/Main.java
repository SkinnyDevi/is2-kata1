package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person johnDoe = new Person("John Doe", 86868686, LocalDate.of(2000, 1, 1));
        System.out.println(johnDoe  );
    }
}