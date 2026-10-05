package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Matin", LocalDate.of(2006, 06, 10));
        System.out.println(student.getName() + " tiene " + student.getAge() + " años.");
    }
}