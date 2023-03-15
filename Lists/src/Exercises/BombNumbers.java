package Exercises;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] numberAndPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int specialNumber = numberAndPower[0];
        int power = numberAndPower[1];

        mainAction(numbers, specialNumber, power);

        calculateAndPrintSum(numbers);
    }

    private static void calculateAndPrintSum(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    private static void mainAction(List<Integer> numbers, int specialNumber, int power) {
        while (numbers.contains((Integer) specialNumber)) {
            for (int i = 0; i < power; i++) {
                if (numbers.contains((Integer) specialNumber)) {
                    detonatedElements(numbers, specialNumber);
                }
            }
            numbers.remove((Integer) specialNumber);
        }
    }

    private static void detonatedElements(List<Integer> numbers, int specialNumber) {
        if (numbers.indexOf(specialNumber) > 0) {
            numbers.remove(numbers.indexOf((Integer) specialNumber) - 1);
        }
        if (numbers.indexOf(specialNumber) < numbers.size() - 1) {
            numbers.remove(numbers.indexOf((Integer) specialNumber) + 1);
        }
    }
}
