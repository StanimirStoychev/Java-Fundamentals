package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = filterByEvenLength(scanner);

        printOutput(words);
    }

    private static void printOutput(String[] words) {
        Arrays.stream(words).forEach(System.out::println);
    }

    private static String[] filterByEvenLength(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);
    }
}
