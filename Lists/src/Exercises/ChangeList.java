package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readIntegers(scanner);

        mainAction(scanner, numbers);

        printList(numbers);
    }

    private static List<Integer> readIntegers(Scanner scanner) {
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numbers;
    }

    private static void mainAction(Scanner scanner, List<Integer> numbers) {
        String command;

        while (!"end".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];
            int element = Integer.parseInt(commandParts[1]);

            switch (action) {
                case "Delete":
                    delete(numbers, element);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    insert(numbers, element, index);
                    break;
            }
        }
    }

    private static List<Integer> delete(List<Integer> numbers, int element) {
        int length = numbers.size();
        for (int i = 0; i < length; i++) {
            if (numbers.get(i) == element) {
                numbers.remove((Integer) element);
                length--;
            }
        }
        return numbers;
    }

    private static List<Integer> insert(List<Integer> numbers, int element, int index) {
        numbers.add(index, element);
        return numbers;
    }

    private static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
