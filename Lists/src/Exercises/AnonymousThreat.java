package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command;

        while (!"3:1".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            if ("merge".equals(action)) {
                merge(input, commandParts);
            } else if ("divide".equals(action)) {
                divide(input, commandParts);
            }
        }

        printList(input);

    }

    private static void divide(List<String> input, String[] commandParts) {
        int index = Integer.parseInt(commandParts[1]);
        int partitions = Integer.parseInt(commandParts[2]);

        if (index >= 0 && index < input.size() && partitions >= 0 && partitions <= 100) {
            String element = input.get(index);
            List<String> newList = new ArrayList<>();

            if (element.length() % partitions == 0) {
                int portionLength = element.length() / partitions;
                int count = 0;
                for (int i = 0; i < partitions; i++) {
                    String concat = "";
                    for (int j = 0; j < portionLength; j++) {
                        char symbol = element.charAt(count);
                        concat += symbol;
                        count++;
                    }
                    newList.add(concat);
                }
            } else {
                int portionLength = element.length() / partitions;
                int count = 0;
                for (int i = 0; i < partitions; i++) {
                    String concat = "";

                    if (i == partitions - 1) {
                        for (int j = count; j < element.length(); j++) {
                            char symbol = element.charAt(count);
                            concat += symbol;
                            count++;
                        }
                    } else {
                        for (int j = 0; j < portionLength; j++) {
                            char symbol = element.charAt(count);
                            concat += symbol;
                            count++;
                        }
                    }
                    newList.add(concat);
                }
            }
            input.remove(index);
            input.addAll(index, newList);
        }
    }

    private static void merge(List<String> input, String[] commandParts) {
        int startIndex = Integer.parseInt(commandParts[1]);
        int endIndex = Integer.parseInt(commandParts[2]);

        if (startIndex < 0) {
            startIndex = 0;
        }
        if (endIndex > input.size() - 1) {
            endIndex = input.size() - 1;
        }
        int counter = startIndex;

        for (int i = startIndex; i < endIndex; i++) {
            String concat = input.get(counter) + input.get(counter + 1);
            input.set(counter, concat);
            input.remove(counter + 1);
        }
    }

    private static void printList(List<String> input) {
        for (String string : input) {
            System.out.print(string + " ");
        }
    }
}
