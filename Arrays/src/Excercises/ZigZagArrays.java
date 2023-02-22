package Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String left = input[0];
            String right = input[1];

            if (i % 2 == 0) {
                first[i] = left;
                second[i] = right;
            } else {
                first[i] = right;
                second[i] = left;
            }
        }

        for (String s : first) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : second) {
            System.out.print(s + " ");
        }
    }
}
