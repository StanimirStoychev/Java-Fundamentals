package MoreExercises;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            char[] digits = scanner.nextLine().toCharArray();
            int digit = digits[0] - '0';
            int offset = (digit - 2) * 3;
            if (digit == 8 || digit == 9) {
                offset += 1;
            }
            int letterIndex = 97 + offset + digits.length - 1;
            if (digit == 0) {
                letterIndex = 32;
            }
            char symbol = (char) letterIndex;
            sb.append(symbol);
        }

        System.out.println(sb);
    }
}
