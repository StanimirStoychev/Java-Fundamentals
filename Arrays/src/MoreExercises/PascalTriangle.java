package MoreExercises;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int[] row = new int[lines];
        int[] current = new int[lines];
        row[0] = 1;
        System.out.println(row[0]);

        for (int i = 1; i < lines; i++) {
            current[0] = 1;
            System.out.printf("%d ",current[0]);
            for (int j = 1; j <= i; j++) {
                current[j] = row[j - 1] + row[j];
                System.out.printf("%d ",current[j]);
            }
            for (int j = 0; j < lines; j++) {
                row[j] = current[j];
            }
            System.out.println();
        }
    }
}
