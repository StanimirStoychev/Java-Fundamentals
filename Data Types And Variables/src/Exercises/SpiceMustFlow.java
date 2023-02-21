package Exercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int spices = 0;
        int days = 0;

        while (yield >= 100) {
            spices += yield - 26;
            days++;
            yield -= 10;
            if (yield < 100) {
                spices -= 26;
            }
        }


        System.out.println(days);
        System.out.println(spices);
    }
}
