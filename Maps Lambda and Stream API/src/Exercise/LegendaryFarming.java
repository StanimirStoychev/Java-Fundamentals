package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {

        Map<String, Integer> materials = new LinkedHashMap<>();

        addMaterials(materials);

        printOutput(materials);
    }

    private static void printOutput(Map<String, Integer> materials) {
        for (var material : materials.entrySet()) {
            System.out.printf("%s: %d%n", material.getKey(), material.getValue());
        }
    }

    private static void addMaterials(Map<String, Integer> materials) {
        Scanner scanner = new Scanner(System.in);

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        boolean winner = false;

        while (!winner) {
            String[] input = scanner.nextLine().split("\\s+");
            label:
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                materials.putIfAbsent(material, 0);
                materials.put(material, materials.get(material) + quantity);

                if (materials.get(material) >= 250) {
                    switch (material) {
                        case "shards":
                            System.out.println("Shadowmourne obtained!");
                            materials.put(material, materials.get(material) - 250);
                            winner = true;
                            break label;
                        case "fragments":
                            System.out.println("Valanyr obtained!");
                            materials.put(material, materials.get(material) - 250);
                            winner = true;
                            break label;
                        case "motes":
                            System.out.println("Dragonwrath obtained!");
                            materials.put(material, materials.get(material) - 250);
                            winner = true;
                            break label;
                    }
                }
            }
        }
    }
}
