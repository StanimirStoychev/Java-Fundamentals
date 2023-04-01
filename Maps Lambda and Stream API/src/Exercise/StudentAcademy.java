package Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> grades = new LinkedHashMap<>();

        addStudentsAndGrades(scanner, n, grades);

        printOutput(grades);
    }

    private static void printOutput(Map<String, List<Double>> grades) {
        for (var student : grades.entrySet()) {
            if (student.getValue().get(0) >= 4.50) {
                System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue().get(0));
            }
        }
    }

    private static void addStudentsAndGrades(Scanner scanner, int n, Map<String, List<Double>> grades) {
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            grades.putIfAbsent(name, new ArrayList<>());
            if (grades.get(name).isEmpty()) {
                grades.get(name).add(grade);
            } else {
                grades.get(name).set(0, (grades.get(name).get(0) + grade) / 2);
            }
        }
    }
}
