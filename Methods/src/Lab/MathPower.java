package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        raiseNumberByPower(number, power);
    }
    private static void raiseNumberByPower(double number, double power) {
        double sum = number;
        for (int i = 1; i < power; i++) {
            sum *= number;
        }
        System.out.println(new DecimalFormat("0.####").format(sum));
    }
}
