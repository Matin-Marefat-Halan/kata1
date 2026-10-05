package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Matin", LocalDate.of(2006, 06, 10));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}