package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String command;

        while (!"end".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split("\\s+");

            if (commandParts[0].equals("Add")) {
                wagons.add(Integer.parseInt(commandParts[1]));
            } else {
                int people = Integer.parseInt(commandParts[0]);
                addPassengers(wagons, capacity, people);
            }
        }

        printList(wagons);
    }

    private static List<Integer> addPassengers (List<Integer> wagons, int capacity, int people) {

        for (Integer currentPeople : wagons) {
            if (currentPeople + people <= capacity) {
                wagons.set(wagons.indexOf(currentPeople), currentPeople + people);
                break;
            }
        }
        return wagons;
    }

    private static void printList(List<Integer> wagons) {
        for (Integer people : wagons) {
            System.out.print(people + " ");
        }
    }
}
