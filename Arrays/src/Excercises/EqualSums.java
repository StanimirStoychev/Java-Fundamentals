package Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isValid = false;
        int isValidAtIndex = 0;
        for (int i = 0; i < numbers.length; i++) { // обхождаме масива
            int leftSum = 0;
            int rightSum = 0; // нулираме 2-та брояча
            for (int j = i; j >= 0; j--) { // от i-тия елемент в обратен ред (ляво)
                leftSum += numbers[j];  // събираме елементите
            }
            for (int j = i; j < numbers.length; j++) { // от i-тия елемент в нарастващ ред (дясно)
                rightSum += numbers[j]; // събираме елементите
            }

            if (leftSum == rightSum) { // ако има равенство
                isValid = true; // вдигаме флаг, който да използваме при принтирането
                isValidAtIndex = i; // и записваме индекса, който отговаря на условието
                break; // имаме победител
            }
        }

        if (isValid) {
            System.out.println(isValidAtIndex);
        } else {
            System.out.println("no");
        }
    }
}