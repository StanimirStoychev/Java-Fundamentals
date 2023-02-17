package Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (factorial(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    private static boolean factorial(String number) {
        int value = Integer.parseInt(number);
        int sum = 0;
        for (int i = 0; i <= number.length() - 1; i++) {
            int n = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (n == 0) {
                sum += 1;
                continue;
            } else if (n == 1) {
                sum += 1;
                continue;
            } else if (n == 2) {
                sum += 2;
                continue;
            }
            int currentSum = 1;
            for (int j = 2; j <= n; j++) {
                currentSum *= j;
            }
            sum += currentSum;
        }

        return value == sum;
    }
}
