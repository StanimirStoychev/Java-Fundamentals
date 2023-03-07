package Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double second = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculate(first, operator, second));
    }

    private static double calculate(double first, String operator, double second) {
        double result = 0;

        switch (operator) {
            case "/":
                result = first / second;
                break;
            case "*":
                result = first * second;
                break;
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
        }
        return result;
    }
}
