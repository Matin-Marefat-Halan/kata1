package software.ulpgc.katas;

import java.time.LocalDate;

public class Student {
    private final String name;
    private final java.time.LocalDate birthday;

    public Student(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
