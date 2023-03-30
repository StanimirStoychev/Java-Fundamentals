package Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        fillTheCourses(scanner, courses);

        printResult(courses);
    }

    private static void printResult(Map<String, List<String>> courses) {
        for (var entry : courses.entrySet()) {
            String course = entry.getKey();
            List<String> students = entry.getValue();
            System.out.printf("%s: %d%n", course, students.size());
            students.forEach(s -> System.out.printf("-- %s%n", s));
        }
    }

    private static void fillTheCourses(Scanner scanner, Map<String, List<String>> courses) {
        String command;
        while (!"end".equals(command = scanner.nextLine())) {
            String[] input = command.split(" : ");
            String course = input[0];
            String student = input[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);
        }
    }
}
