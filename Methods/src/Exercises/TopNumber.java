package Exercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        topNumber(number);
    }

    private static void topNumber(int number) {

        for (int i = 17; i <= number; i++) {

            boolean holdsOddDigit = false;
            int sum = 0;
            String numberString = String.valueOf(i);

            for (int j = 0; j < numberString.length(); j++) {
                int n = Integer.parseInt(String.valueOf(numberString.charAt(j)));
                sum += n;
                if (n % 2 != 0) {
                    holdsOddDigit = true;
                }
            }
            if (holdsOddDigit && sum % 8 == 0) {
                System.out.println(i);
            }
        }
    }
}
