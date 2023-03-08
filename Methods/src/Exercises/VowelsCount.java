package Exercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(vowelsCount(text));
    }

    private static int vowelsCount(String text) {
        String textToLowerCase = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = textToLowerCase.charAt(i);
            switch (letter) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}
