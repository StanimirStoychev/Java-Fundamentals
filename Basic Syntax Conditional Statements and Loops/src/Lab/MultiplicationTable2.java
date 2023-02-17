package Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startRow = Integer.parseInt(scanner.nextLine());

        if (startRow < 10) {
            for (int i = startRow; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        } else {
            System.out.printf("%d X %d = %d%n", n, startRow, n * startRow);
        }

    }
}
