package Lab;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfLines = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < countOfLines; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        int count = 1;
        Collections.sort(products);

        for (String product : products) {
            System.out.println(count + "." + product);
            count++;
        }


    }
}
