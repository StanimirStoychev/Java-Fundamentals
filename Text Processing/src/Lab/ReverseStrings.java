package Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while (!"end".equals(input = scanner.nextLine())) {

            String reversed = getReversed(input);
            printOutput(input, reversed);
        }
    }

    private static void printOutput(String input, String reversed) {
        System.out.printf("%s = %s%n", input, reversed);
    }

    private static String getReversed(String input) {
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }

        return reversedBuilder.toString();
    }
}
