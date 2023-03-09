package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printResult(number);
    }

    private static void printResult(int number) {
        int[] output = new int[number];

        if (number > 2) {
            output[0] = 1;
            output[1] = 1;
            output[2] = 2;
            for (int i = 3; i < number; i++) {
                output[i] = output[i - 1] + output[i - 2] + output[i - 3];
            }
        } else if (number == 1) {
            output[0] = 1;
        } else if (number == 2) {
            output[0] = 1;
            output[1] = 1;
        }

        Arrays.stream(output).forEach(n -> System.out.print(n + " "));
    }
}
