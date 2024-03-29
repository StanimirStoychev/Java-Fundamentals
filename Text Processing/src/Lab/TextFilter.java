package Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                text = text.replaceAll(bannedWord, new String(new char[bannedWord.length()]).replace('\0', '*'));
            }
        }
        System.out.print(text);
    }
}
