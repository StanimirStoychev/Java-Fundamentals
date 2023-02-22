package Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] people = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentPeople = Integer.parseInt(scanner.nextLine());
            people[i] = currentPeople;
            sum += currentPeople;
        }

        for (int person : people) {
            System.out.print(person + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
