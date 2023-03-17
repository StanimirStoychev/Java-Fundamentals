package MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        //NOT WORKING NOW
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String text = scanner.nextLine();
        StringBuilder output = new StringBuilder();

        mainAction(numbers, text, output);
        printOutput(output);
    }

    private static void printOutput(StringBuilder output) {
        System.out.println(output);
    }

    private static void mainAction(List<String> numbers, String text, StringBuilder output) {
        for (int i = 0; i < numbers.size(); i++) {

            String number = numbers.get(i);

            int index = getIndex(i, number, text);

            fillTheOutput(text, output, index);
        }
    }

    private static void fillTheOutput(String text, StringBuilder output, int index) {
        output.append(text.charAt(index));
    }

    private static int getIndex(int i, String number, String text) {
        int index = 0;
        for (int j = 0; j < number.length(); j++) {
            index = index + Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        checkRealIndex(text, index);
        return index;
    }

    private static void checkRealIndex(String text, int index) {
        while (index > text.length()) {
            index = index - text.length();
        }
    }
}