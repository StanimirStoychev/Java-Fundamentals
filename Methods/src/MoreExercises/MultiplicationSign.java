package MoreExercises;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(product(num1, num2, num3));
    }

    private static String product(int num1, int num2, int num3) {
        int negativeCount = 0;

        if (num1 < 0) {
            negativeCount++;
        } else if (num2 < 0) {
            negativeCount++;
        } else if (num3 < 0) {
            negativeCount++;
        }

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            return "zero";
        } else if (negativeCount % 2 == 1) {
            return "negative";
        } else {
            return "positive";
        }
    }
}
