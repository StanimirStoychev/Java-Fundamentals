package MoreExercises;

import java.util.Scanner;

public class AsciiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);

        String text = scanner.next();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current > start && current < end) {
                sum += current;
            }
        }

        System.out.println(sum);
    }
}
