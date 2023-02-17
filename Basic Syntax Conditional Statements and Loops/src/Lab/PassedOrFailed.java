package Lab;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade > 3) {
            System.out.println("Lab.Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
