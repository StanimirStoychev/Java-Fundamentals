package MoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        double outFall4 = 39.99;
        double CSOG = 15.99;
        double zplinterZell = 19.99;
        double honored2 = 59.99;
        double roverWatch = 29.99;
        double roverWatchOriginsEdition = 39.99;

        double sum = 0;

        boolean outOfMoney = false;

        String command;

        while (!"Game Time".equals(command = scanner.nextLine())) {
            switch (command) {
                case "OutFall 4":
                    if (balance >= outFall4) {
                        balance -= outFall4;
                        sum += outFall4;
                        System.out.println("Bought OutFall 4");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (balance >= CSOG) {
                        balance -= CSOG;
                        sum += CSOG;
                        System.out.println("Bought CS: OG");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance >= zplinterZell) {
                        balance -= zplinterZell;
                        sum += zplinterZell;
                        System.out.println("Bought Zplinter Zell");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (balance >= honored2) {
                        balance -= honored2;
                        sum += honored2;
                        System.out.println("Bought Honored 2");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (balance >= roverWatch) {
                        balance -= roverWatch;
                        sum += roverWatch;
                        System.out.println("Bought RoverWatch");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance >= roverWatchOriginsEdition) {
                        balance -= roverWatchOriginsEdition;
                        sum += roverWatchOriginsEdition;
                        System.out.println("Bought RoverWatch Origins Edition");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                outOfMoney = true;
                break;
            }
        }

        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, balance);
        }
    }
}
