package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Matin", java.time.LocalDate.of(2006, 6, 10));
        System.out.println(student.getName() + " tiene " + student.getAge() + " años.");
    }
}
