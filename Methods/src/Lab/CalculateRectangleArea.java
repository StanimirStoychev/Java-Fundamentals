package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        printArea(calculateRectangleArea(width, height));
    }

    private static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    private static void printArea(double area){
        System.out.printf("%.0f", area);
    }
}
