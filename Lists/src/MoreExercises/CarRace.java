package MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> leftPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();
        List<Integer> rightPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        double leftPlayerTime = getLeftPlayerTime(leftPlayer);

        double rightPlayerTime = getRightPlayerTime(rightPlayer);

        printWinner(leftPlayerTime, rightPlayerTime);
    }

    private static void printWinner(double leftPlayerTime, double rightPlayerTime) {
        if (leftPlayerTime < rightPlayerTime) {
            System.out.printf("The winner is left with total time: %.1f", leftPlayerTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightPlayerTime);
        }
    }

    private static double getRightPlayerTime(List<Integer> rightPlayer) {
        double time = 0;
        boolean reduced = false;
        for (int i = rightPlayer.size() - 1; i >= 0; i--) {
            time += rightPlayer.get(i);
            if (!reduced && rightPlayer.get(i) == 0) {
                time *= 0.8;
                reduced = true;
            }
        }
        return time;
    }

    private static double getLeftPlayerTime(List<Integer> leftPlayer) {
        double time = 0;
        boolean reduced = false;
        for (Integer seconds : leftPlayer) {
            time += seconds;
            if (!reduced && seconds == 0) {
                time *= 0.8;
                reduced = true;
            }
        }
        return time;
    }
}
