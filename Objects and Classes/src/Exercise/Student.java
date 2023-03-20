package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Student {

    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", firstName, lastName, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        addStudents(scanner, n, students);

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        students.forEach(System.out::println);

    }

    private static void addStudents(Scanner scanner, int n, List<Student> students) {
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String firstName = info[0];
            String lastName = info[1];
            double grade = Double.parseDouble(info[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
    }
}
