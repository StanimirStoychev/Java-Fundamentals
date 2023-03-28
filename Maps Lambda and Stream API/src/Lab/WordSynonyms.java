package Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        addSynonyms(scanner, n, words);

        printOutput(words);
    }

    private static void printOutput(Map<String, List<String>> words) {
        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            String word = entry.getKey();
            List<String> synonyms = entry.getValue();
            System.out.printf("%s - ", word);
            for (int i = 0; i < synonyms.size(); i++) {
                System.out.print(synonyms.get(i));
                if (i != synonyms.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    private static void addSynonyms(Scanner scanner, int n, Map<String, List<String>> words) {
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }
    }
}
