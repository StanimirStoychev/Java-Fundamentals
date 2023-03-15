package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = readIntegerList(scanner);
        List<Integer> player2 = readIntegerList(scanner);

        mainAction(player1, player2);

        printFormattedResult(player1, player2);
    }

    private static List<Integer> readIntegerList(Scanner scanner) {
        List<Integer> player = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return player;
    }

    private static void printFormattedResult(List<Integer> player1, List<Integer> player2) {
        String winner = "";
        int sum = 0;

        if (player1.isEmpty()) {
            winner = "Second";
            sum = getSum(player2);
        }
        if (player2.isEmpty()) {
            winner = "First";
            sum = getSum(player1);
        }

        System.out.printf("%s player wins! Sum: %d", winner, sum);
    }

    private static int getSum(List<Integer> player2) {
        return player2.stream().mapToInt(Integer::intValue).sum();
    }

    private static void mainAction(List<Integer> player1, List<Integer> player2) {
        while (!player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.get(0);
            int card2 = player2.get(0);
            if (card1 == card2) {
                removingFirstCards(player1, player2);
            } else if (card1 > card2) {
                winnerAddCards(player1, (Integer) card1, (Integer) card2);
                removingFirstCards(player1, player2);
            } else {
                winnerAddCards(player2, (Integer) card2, (Integer) card1);
                removingFirstCards(player2, player1);
            }
        }
    }

    private static void winnerAddCards(List<Integer> player1, Integer card1, Integer card2) {
        player1.add(card1);
        player1.add(card2);
    }

    private static void removingFirstCards(List<Integer> player1, List<Integer> player2) {
        player1.remove(0);
        player2.remove(0);
    }
}
