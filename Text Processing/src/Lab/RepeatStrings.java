package Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (String current : input) {
            for (int j = 0; j < current.length(); j++) {
                System.out.print(current);
            }
        }
    }
}
