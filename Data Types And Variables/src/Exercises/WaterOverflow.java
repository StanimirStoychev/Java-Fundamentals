package Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (sum + quantity <= 255) {
                sum += quantity;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(sum);
    }
}
