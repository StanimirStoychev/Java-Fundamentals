package MoreExercises;

import java.util.Locale;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String type;

        while (!"END".equals(type = scanner.nextLine())) {
            Scanner input = new Scanner(type);
            if (input.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", type);
            } else if (input.hasNextInt()) {
                System.out.printf("%s is integer type%n", type);
            } else if (type.length() == 1) {
                System.out.printf("%s is character type%n", type);
            } else if (input.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", type);
            } else if (input.hasNextLine() && !input.hasNextDouble()) {
                System.out.printf("%s is string type%n", type);
            }
        }
    }
}
