package MoreExercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 3; i++) {
            if (first > second && first > third) {
                System.out.println(first);
                first = Integer.MIN_VALUE;
            } else if (second > first && second > third) {
                System.out.println(second);
                second = Integer.MIN_VALUE;
            } else {
                System.out.println(third);
                third = Integer.MIN_VALUE;
            }
        }
    }
}
