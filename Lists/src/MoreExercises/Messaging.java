package MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String text = scanner.nextLine();
        List<String> chars = Arrays.stream(text.split("")).collect(Collectors.toList());
        StringBuilder output = new StringBuilder();

        mainAction(numbers, chars, output);
        printOutput(output);
    }

    private static void printOutput(StringBuilder output) {
        System.out.println(output);
    }

    private static void mainAction(List<String> numbers, List<String> chars, StringBuilder output) {
        for (int i = 0; i < numbers.size(); i++) {

            String number = numbers.get(i);

            int index = getIndex(i, number, chars);

            fillTheOutput(chars , output, index);
        }
    }

    private static void fillTheOutput(List<String> chars, StringBuilder output, int index) {
        output.append(chars.get(index));
        chars.remove(index);
    }

    private static int getIndex(int i, String number, List<String> chars) {
        int index = 0;
        for (int j = 0; j < number.length(); j++) {
            index = index + Integer.parseInt(String.valueOf(number.charAt(j)));
        }
        while (index > chars.size()) {
            index = index - chars.size();
        }
        return index;
    }
}