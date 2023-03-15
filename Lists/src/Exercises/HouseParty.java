package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        List<String> people = goingOrNot();

        printList(people);
    }

    private static List<String> goingOrNot() {
        Scanner scanner = new Scanner(System.in);

        List<String> people = new ArrayList<>();
        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            String goingOrNot = data[2];

            switch (goingOrNot) {
                case "going!":
                    going(people, name);
                    break;
                case "not":
                    notGoing(people, name);
                    break;
            }
        }
        return people;
    }

    private static void notGoing(List<String> people, String name) {
        if (people.contains(name)) {
            people.remove((String) name);
        } else {
            System.out.println(name + " is not in the list!");
        }
    }

    private static void going(List<String> people, String name) {
        if (!people.contains(name)) {
            people.add(name);
        } else {
            System.out.println(name + " is already in the list!");
        }
    }

    private static void printList(List<String> people) {
        for (String person : people) {
            System.out.println(person);
        }
    }
}
