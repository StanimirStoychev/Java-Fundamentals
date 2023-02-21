package Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String biggestModel = "";
        int n = Integer.parseInt(scanner.nextLine());
        double lastBigger = 0;

        for (int i = 0; i < n; i++) {
            String currentModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * (radius * radius) * height;
            if (volume > lastBigger) {
                lastBigger = volume;
                biggestModel = currentModel;
            }
        }

        System.out.println(biggestModel);
    }
}
