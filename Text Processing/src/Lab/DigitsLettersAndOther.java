package Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current >= 48 && current <= 57) {
                digits.append(current);
            } else if (current >= 65 && current <= 90 || current >= 97 && current <= 122) {
                letters.append(current);
            } else {
                others.append(current);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
