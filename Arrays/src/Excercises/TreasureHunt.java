package Excercises;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String input;

        while (!"Yohoho!".equals(input = scanner.nextLine())) {
            String[] commandParts = input.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Loot":
                    for (int i = 0; i < commandParts.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandParts[i].equals(treasureChest[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = commandParts[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandParts[1]);

                    if (position <= treasureChest.length - 1 && position >= 0) {
                        String dropItem = treasureChest[position];
                        for (int i = position; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":

                    break;
            }
        }
    }
}
