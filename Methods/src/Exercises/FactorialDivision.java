package Exercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long first = Integer.parseInt(scanner.nextLine());
        long second = Integer.parseInt(scanner.nextLine());

        double firstFactorial = findFactorial(first);
        double secondFactorial = findFactorial(second);


        System.out.printf("%.2f", result(firstFactorial, secondFactorial));
    }
    private static double findFactorial (long number) {
        int factorial = 1;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static double result (double first, double second) {
        return first / second;
    }
}
