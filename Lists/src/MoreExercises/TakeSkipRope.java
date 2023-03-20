package MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> numbers = new ArrayList<>();
        List<String> characters = new ArrayList<>();

        listSeparating(input, numbers, characters);

        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();

        fillTakeAndSkip(numbers, take, skip);

        String resultOutput = mainAction(characters, take, skip);

        printResult(resultOutput);
    }

    private static void printResult(String resultOutput) {
        System.out.println(resultOutput);
    }

    private static String mainAction(List<String> characters, List<Integer> take, List<Integer> skip) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < take.size(); i++) {
            int currentTake = take.get(i);
            int length = counter + currentTake;

            for (int j = counter; j < length; j++) {
                result.append(characters.get(j));
                if (j == characters.size() - 1) {
                    break;
                }
            }

            int currentSkip = skip.get(i);
            counter += currentSkip + currentTake;
        }
        return result.toString();
    }

    private static void fillTakeAndSkip(List<String> numbers, List<Integer> take, List<Integer> skip) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                take.add(Integer.parseInt(numbers.get(i)));
            } else {
                skip.add(Integer.parseInt(numbers.get(i)));
            }
        }
    }

    private static void listSeparating(String input, List<String> numbers, List<String> characters) {
        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (currentChar.matches("[0-9]")) {
                numbers.add(currentChar);
            } else {
                characters.add(currentChar);
            }
        }
    }
}
