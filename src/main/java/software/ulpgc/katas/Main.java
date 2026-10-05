package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Matin", java.time.LocalDate.of(2006, 6, 10));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }

