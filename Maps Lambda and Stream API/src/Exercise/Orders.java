package Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {

        Map<String, List<Double>> productsAndPrice = new LinkedHashMap<>();

        fillTheMapCorrectlyByCondition(productsAndPrice);

        calculateTheOutput(productsAndPrice);
    }

    private static void calculateTheOutput(Map<String, List<Double>> productsAndPrice) {
        for (var entry : productsAndPrice.entrySet()) {
            double price = entry.getValue().get(0);
            double quantity = entry.getValue().get(1);
            double result = price * quantity;
            System.out.printf("%s -> %.2f%n", entry.getKey(), result);
        }
    }

    private static void fillTheMapCorrectlyByCondition(Map<String, List<Double>> productsAndPrice) {
        Scanner scanner = new Scanner(System.in);

        String command;

        while (!"buy".equals(command = scanner.nextLine())) {
            String[] info = command.split("\\s+");
            String product = info[0];
            double price = Double.parseDouble(info[1]);
            double quantity = Double.parseDouble(info[2]);

            productsAndPrice.putIfAbsent(product, new ArrayList<>());
            if (productsAndPrice.get(product).isEmpty()) {
                productsAndPrice.get(product).add(price);
                productsAndPrice.get(product).add(quantity);
            } else {
                productsAndPrice.get(product).set(0, price);
                double oldQuantity = productsAndPrice.get(product).get(1);
                productsAndPrice.get(product).set(1, oldQuantity + quantity);
            }
        }
    }
}
