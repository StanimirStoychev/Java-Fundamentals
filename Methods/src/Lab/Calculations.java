package Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        calculator(operation, firstNumber, secondNumber);
    }

    public static void calculator(String operation, int first, int second) {
        int result = 0;
        switch (operation) {
            case "add":
                result = first + second;
                break;
            case "multiply":
                result = first * second;
                break;
            case "subtract":
                result = first - second;
                break;
            case "divide":
                result = first / second;
                break;
        }
        System.out.println(result);
    }
}
