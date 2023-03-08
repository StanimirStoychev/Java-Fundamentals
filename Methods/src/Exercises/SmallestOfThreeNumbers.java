package Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNumber(first, second, third));
    }

    private static int smallestNumber(int first, int second, int third) {
        int result = 0;

        if (first <= second) {
            result = first;
        }
        if (first >= second) {
            result = second;
        }
        if (result > third) {
            result = third;
        }
        return result;
    }
}
