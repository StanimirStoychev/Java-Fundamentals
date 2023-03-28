package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> counts = new LinkedHashMap<>();

        getCounts(text, counts);

        printOutput(counts);
    }

    private static void printOutput(Map<Character, Integer> counts) {
        for (var entry : counts.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static void getCounts(String text, Map<Character, Integer> counts) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != 32) {
                counts.putIfAbsent(ch, 0);
                counts.put(ch, counts.get(ch) + 1);
            }
        }
    }
}
