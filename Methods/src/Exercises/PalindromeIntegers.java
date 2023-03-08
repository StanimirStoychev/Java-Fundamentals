package Exercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while (!"END".equals(input = scanner.nextLine())) {

            System.out.println(isPalindromeNumber(input));
        }
    }

    private static boolean isPalindromeNumber (String number) {

        StringBuilder reversedNumber = new StringBuilder();

        for (int i = number.length() - 1; i > 0; i--) {
            reversedNumber.append(number.charAt(i));
        }

        String reversed = String.valueOf(reversedNumber);

        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) != reversed.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
