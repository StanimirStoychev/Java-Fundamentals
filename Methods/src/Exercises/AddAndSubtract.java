package Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(first, second, third));
    }

    private static int sum(int first, int second) {
        return first + second;
    }

    private static int subtract(int first, int second, int third) {
        int sum = sum(first, second);
        return sum - third;
    }
}
