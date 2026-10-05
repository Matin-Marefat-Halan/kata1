package software.ulpgc.katas;

import java.time.LocalDate;

public class Student {
    private final String name;
    private final java.time.LocalDate birthday;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        long days = java.time.LocalDate.now().toEpochDay() - this.birthday.toEpochDay();
        return (int) (days / 365);
    }

    public Student(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
