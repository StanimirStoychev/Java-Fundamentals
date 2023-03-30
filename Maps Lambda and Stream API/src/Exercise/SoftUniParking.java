package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredPeople = new LinkedHashMap<>();

        inputActions(scanner, n, registeredPeople);

        printRemainingPeople(registeredPeople);
    }

    private static void printRemainingPeople(Map<String, String> registeredPeople) {
        registeredPeople.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }

    private static void inputActions(Scanner scanner, int n, Map<String, String> registeredPeople) {
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String command = commands[0];
            String name = commands[1];

            switch (command) {
                case "register" -> registerPeople(registeredPeople, commands, name);
                case "unregister" -> unregisterPeople(registeredPeople, name);
            }
        }
    }

    private static void unregisterPeople(Map<String, String> registeredPeople, String name) {
        if (!registeredPeople.containsKey(name)) {
            System.out.printf("ERROR: user %s not found%n", name);
        } else {
            registeredPeople.remove(name);
            System.out.printf("%s unregistered successfully%n", name);
        }
    }

    private static void registerPeople(Map<String, String> registeredPeople, String[] commands, String name) {
        String licensePlate = commands[2];
        if (registeredPeople.containsKey(name)) {
            System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
        } else {
            registeredPeople.put(name, licensePlate);
            System.out.printf("%s registered %s successfully%n", name, licensePlate);
        }
    }
}
