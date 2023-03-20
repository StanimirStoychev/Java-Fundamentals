package MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        List<Integer> originalQuality = readIntegersFromConsole(scanner);
        List<Integer> qualityOfDrums = new java.util.ArrayList<>(originalQuality);

        String command;

        money = mainAction(scanner, money, originalQuality, qualityOfDrums);

        printFormattedOutput(money, qualityOfDrums);
    }

    private static double mainAction(Scanner scanner, double money, List<Integer> originalQuality, List<Integer> qualityOfDrums) {
        String command;
        while (!"Hit it again, Gabsy!".equals(command = scanner.nextLine())) {
            int power = Integer.parseInt(command);

            for (int i = 0; i < qualityOfDrums.size(); i++) {
                int currentDrum = qualityOfDrums.get(i);
                qualityOfDrums.set(i, currentDrum - power);
                if (qualityOfDrums.get(i) <= 0 && money - originalQuality.get(i) * 3 > 0) {
                    qualityOfDrums.set(i, originalQuality.get(i));
                    money -= originalQuality.get(i) * 3;
                }
                if (qualityOfDrums.get(i) <= 0 && money <= 0) {
                    qualityOfDrums.remove(i);
                }
            }
        }
        return money;
    }

    private static void printFormattedOutput(double money, List<Integer> qualityOfDrums) {
        qualityOfDrums.stream().filter(integer -> integer > 0)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", money);
    }

    private static List<Integer> readIntegersFromConsole(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
    }
}
