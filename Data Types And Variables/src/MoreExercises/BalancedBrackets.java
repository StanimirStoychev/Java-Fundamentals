package MoreExercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOpened = false;
        boolean isBalanced = true;
        int booleanCounter = 0;
        boolean isOpenedFirst = false;

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                if (booleanCounter == 0) {
                    isOpenedFirst = true;
                }
                if (!isOpened) {
                    isOpened = true;
                    booleanCounter++;
                } else {
                    isBalanced = false;
                    booleanCounter++;
                }
            }
            if (input.equals(")")) {
                if (isOpened) {
                    isOpened = false;
                    booleanCounter++;
                } else {
                    isBalanced = false;
                    booleanCounter++;
                }
            }
        }

        if (isBalanced && !isOpened && isOpenedFirst) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
