package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int inputLength = input.length();
            int sum = 0;

            for (int j = 0; j < inputLength; j++) {
                char currentChar = input.charAt(j);
                switch (currentChar) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        sum += currentChar * inputLength;
                        break;
                    default:
                        sum += currentChar / inputLength;
                        break;
                }
            }
            numbers[i] = sum;
        }
        Arrays.stream(numbers).sorted().forEach(System.out::println);
    }
}
