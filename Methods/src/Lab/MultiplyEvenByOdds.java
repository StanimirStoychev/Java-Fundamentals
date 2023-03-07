package Lab;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        printMultiplyEvenByOdd(evenSum, oddSum);

    }

    private static int getEvenSum(int n) {
        int evenSum = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                evenSum += n % 10;
            }
            n /= 10;
        }
        return evenSum;
    }

    private static int getOddSum(int n) {
        int oddSum = 0;

        while (n != 0) {
            if (n % 2 != 0) {
                oddSum += n % 10;
            }
            n /= 10;
        }
        return oddSum;
    }

    private static void printMultiplyEvenByOdd(int even, int odd) {
        System.out.println(even * odd);
    }
}
