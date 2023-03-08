package Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {
        int length = text.length();
        if (length % 2 != 0) {
            System.out.println(text.charAt(length / 2));
        } else {
            System.out.println(text.charAt(length / 2 - 1) + "" + text.charAt(length / 2));
        }
    }
}
