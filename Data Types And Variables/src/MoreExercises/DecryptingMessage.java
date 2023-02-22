package MoreExercises;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int keyIndex = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            String symbol = scanner.nextLine();
            char c = (char) (symbol.charAt(0) + keyIndex);
            sb.append(c);
        }

        System.out.println(sb);
    }
}
