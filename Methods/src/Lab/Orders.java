package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printTotalPrice(product, quantity);
    }
    public static Double productPrice(String product) {
        double coffeePrice = 1.5;
        double waterPrice = 1;
        double cokePrice = 1.4;
        double snacksPrice = 2;

        switch (product) {
            case "coffee":
                return coffeePrice;
            case "water":
                return waterPrice;
            case "coke":
                return cokePrice;
            case "snacks":
                return snacksPrice;
        }
        return productPrice(product);
    }

    private static void printTotalPrice(String product, int quantity) {
        System.out.printf("%.2f", productPrice(product) * quantity);
    }
}
