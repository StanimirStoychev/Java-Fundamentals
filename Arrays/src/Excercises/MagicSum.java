package Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int secondNumber = numbers[j];

                if (currentNumber + secondNumber == magicSum) {
                    System.out.printf("%d %d%n", currentNumber, secondNumber);
                }
            }
        }
    }
}
