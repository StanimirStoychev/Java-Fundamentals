package Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command;

        while (!"end".equals(command = scanner.nextLine())) {
            String[] input = command.split("\\s+");

            String action = input[0];

            switch (action) {
                case "swap":
                    int firstIndex = Integer.parseInt(input[1]);
                    int secondIndex = Integer.parseInt(input[2]);
                    int firstIndexOriginalNumber = numbers[firstIndex];
                    numbers[firstIndex] = numbers[secondIndex];
                    numbers[secondIndex] = firstIndexOriginalNumber;
                    break;
                case "multiply":
                    int firstIndexx = Integer.parseInt(input[1]);
                    int secondIndexx = Integer.parseInt(input[2]);
                    numbers[firstIndexx] = numbers[firstIndexx] * numbers[secondIndexx];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
            }
        }
        int i = 0;
        for (int number : numbers) {
            if (i != numbers.length - 1) {
                System.out.print(number + ", ");
                i++;
            } else {
                System.out.print(number);
            }
        }
    }
}

