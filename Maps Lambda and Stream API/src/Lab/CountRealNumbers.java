package Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = readInput(scanner);

        TreeMap<Double, Integer> counts = new TreeMap<>();

        getCount(nums, counts);

        printOutput(counts);
    }

    private static void printOutput(TreeMap<Double, Integer> counts) {
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }

    private static void getCount(double[] nums, TreeMap<Double, Integer> counts) {
        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }
    }

    private static double[] readInput(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
