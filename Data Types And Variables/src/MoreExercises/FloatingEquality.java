package MoreExercises;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        boolean isTrue = Math.abs(a - b) < 0.000001;

        if (isTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
