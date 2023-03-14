package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command;

        while (!"end".equals(command = scanner.nextLine())) {
            List<String> commandParts = Arrays.stream(command.split("\\s+")).toList();
            String currentCommand = commandParts.get(0);

            switch (currentCommand) {
                case "Contains" -> {
                    int number = Integer.parseInt(commandParts.get(1));
                    contains(numbers, number);
                }
                case "Print" -> {
                    String evenOrOdd = commandParts.get(1);
                    switch (evenOrOdd) {
                        case "even":
                            printEven(numbers);
                            break;
                        case "odd":
                            printOdd(numbers);
                            break;
                    }
                }
                case "Get" -> getSum(numbers);
                case "Filter" -> {
                    String condition = commandParts.get(1);
                    int num = Integer.parseInt(commandParts.get(2));
                    filter(numbers, condition, num);
                }
            }
        }
    }

    private static void contains(List<Integer> numbers, int number) {
        if (numbers.contains(number)) {
            System.out.println("Yes");
        }
        if (!numbers.contains(number)){
            System.out.println("No such number");
        }
    }

    private static void printEven(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void getSum(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(sum);
    }

    private static void filter(List<Integer> numbers, String condition, int number) {
        for (Integer integer : numbers) {
            switch (condition) {
                case ">":
                    if (integer > number) {
                        System.out.print(integer + " ");
                    }
                    break;
                case "<":
                    if (integer < number) {
                        System.out.print(integer + " ");
                    }
                    break;
                case ">=":
                    if (integer >= number) {
                        System.out.print(integer + " ");
                    }
                    break;
                case "<=":
                    if (integer <= number) {
                        System.out.print(integer + " ");
                    }
                    break;
            }
        }
        System.out.println();
    }
}
