package Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Map<String, Integer> counts = new LinkedHashMap<>();

        getCounts(words, counts);

        List<String> odds = new ArrayList<>();

        getOdds(counts, odds);

        printOutput(odds);
    }

    private static void printOutput(List<String> odds) {
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i != odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void getOdds(Map<String, Integer> counts, List<String> odds) {
        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }
    }

    private static void getCounts(String[] words, Map<String, Integer> counts) {
        for (String word : words) {
            String wordToLowerCase = word.toLowerCase();
            counts.putIfAbsent(wordToLowerCase, 0);
            counts.put(wordToLowerCase, counts.get(wordToLowerCase) + 1);
        }
    }
}
