package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Map<String, Integer> materials = new LinkedHashMap<>();

        fillMaterials(materials);

        printOutput(materials);
    }

    private static void printOutput(Map<String, Integer> materials) {
        for (var entry : materials.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static void fillMaterials(Map<String, Integer> materials) {
        Scanner scanner = new Scanner(System.in);

        String command;
        while (!"stop".equals(command = scanner.nextLine())) {
            int quantity = Integer.parseInt(scanner.nextLine());

            materials.putIfAbsent(command, 0);
            materials.put(command, materials.get(command) + quantity);
        }
        scanner.close();
    }
}
