package Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        char firstC = first.charAt(0);
        char secondC = second.charAt(0);

        printCharactersInRange(firstC, secondC);
    }

    private static void printCharactersInRange(char first, char second) {

        int startCharacter = Math.min(first, second);
        int endCharacter = Math.max(first, second);

        for (int i = ++startCharacter; i < endCharacter; i++) {
            System.out.print((char) i + " ");
        }
    }
}
