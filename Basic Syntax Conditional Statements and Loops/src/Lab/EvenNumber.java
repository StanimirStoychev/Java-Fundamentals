package Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while(!isEven(n)) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The number is: " + n);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
