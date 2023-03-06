package Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println(gradeWord(grade));
    }

    public static String gradeWord(double grade) {
        if (grade >= 2 && grade <= 2.99) {
            return "Fail";
        } else if (grade >= 3 && grade <= 3.49) {
            return "Poor";
        } else if (grade >= 3.5 && grade <= 4.49) {
            return "Good";
        } else if (grade >= 4.5 && grade <= 5.49) {
            return "Very good";
        } else if (grade >= 5.5 && grade <= 6.00) {
            return "Excellent";
        } else {
            return "unknown";
        }
    }
}
