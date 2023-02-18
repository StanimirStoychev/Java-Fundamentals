package MoreExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        System.out.println(sb);
    }
}
