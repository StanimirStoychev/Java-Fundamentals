package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        mainLogic(scanner, numbers);
        printList(numbers);
    }

    private static final String INVALID_INDEX = "Invalid index";
    private static void mainLogic(Scanner scanner, List<Integer> numbers) {
        String command;

        while (!"End".equals(command = scanner.nextLine())) {
            String[] data = command.split("\\s+");
            String action = data[0];

            switch (action) {
                case "Add":
                    add(numbers, Integer.parseInt(data[1]));
                    break;
                case "Insert":
                    if (inRange(numbers, Integer.parseInt(data[2]))) {
                        insert(numbers, Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    } else {
                        System.out.println(INVALID_INDEX);
                    }
                    break;
                case "Remove":
                    if (inRange(numbers, Integer.parseInt(data[1]))) {
                        remove(numbers, Integer.parseInt(data[1]));
                    } else {
                        System.out.println(INVALID_INDEX);
                    }
                    break;
                case "Shift":
                    String direction = data[1];
                    int count = Integer.parseInt(data[2]);
                    switch (direction) {
                        case "left":
                            shiftLeft(numbers, count);
                            break;
                        case "right":
                            shiftRight(numbers, count);
                            break;
                    }
                    break;
            }
        }
    }

    private static boolean inRange(List<Integer> numbers, int index) {
        return numbers.size() > index;
    }

    private static List<Integer> add(List<Integer> numbers, int number) {
        numbers.add((Integer) number);
        return numbers;
    }

    private static List<Integer> insert(List<Integer> numbers, int number, int index) {
        numbers.add(index, number);
        return numbers;
    }

    private static List<Integer> remove(List<Integer> numbers, int index) {
        numbers.remove(index);
        return numbers;
    }

    private static List<Integer> shiftLeft(List<Integer> numbers, int count){
        for (int i = 0; i < count; i++) {
            numbers.add((Integer) numbers.get(0));
            numbers.remove(0);
        }
        return numbers;
    }

    private static List<Integer> shiftRight(List<Integer> numbers, int count){
        for (int i = 0; i < count; i++) {
            int number = numbers.get(numbers.size() - 1);
            numbers.add(0, number);
            numbers.remove(numbers.size() - 1);
        }
        return numbers;
    }

    private static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
