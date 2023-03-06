package MoreExercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[number];

        if (number > 2) {
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < number; i++) {
                numbers[i] = numbers[i - 2] + numbers[i - 1];
            }
            System.out.println(numbers[numbers.length - 1]);
        } else {
            System.out.println(1);
        }


    }
}
