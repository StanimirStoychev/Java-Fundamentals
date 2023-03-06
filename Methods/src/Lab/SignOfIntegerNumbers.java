package Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("The number %d is %s.",number, negativeOrPositive(number));
    }

    public static String negativeOrPositive(int number) {

        if (number == 0) {
            return "zero";
        } else if (number > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
}
