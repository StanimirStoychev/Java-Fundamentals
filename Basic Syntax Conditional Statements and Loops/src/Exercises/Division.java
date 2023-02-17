package Exercises;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isTrue = false;

        if (n % 10 == 0 && !isTrue) {
            System.out.println("The number is divisible by 10");
            isTrue = true;
        } else if (n % 7 == 0 && !isTrue) {
            System.out.println("The number is divisible by 7");
            isTrue = true;
        } else if (n % 6 == 0 && !isTrue) {
            System.out.println("The number is divisible by 6");
            isTrue = true;
        } else if (n % 3 == 0 && !isTrue) {
            System.out.println("The number is divisible by 3");
            isTrue = true;
        } else if (n % 2 == 0 && !isTrue) {
            System.out.println("The number is divisible by 2");
            isTrue = true;
        }

        if (!isTrue) {
            System.out.println("Not divisible");
        }
    }
}
