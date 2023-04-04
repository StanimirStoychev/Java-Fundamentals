package MoreExercises;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestPassword = new HashMap<>();

        fillContestsAndPasswords(scanner, contestPassword);

        Map<String, Map<String, Integer>> users = new HashMap<>();

        fillUsersAndTheirPointsForContests(scanner, contestPassword, users);

        printBestCandidate(users);

        printAllUsersSorted(users);

    }

    private static void printAllUsersSorted(Map<String, Map<String, Integer>> users) {
        System.out.println("Ranking:");
        Map<String, Map<String, Integer>> treeMap = new TreeMap<>(users);

        for (var user : treeMap.entrySet()) {
            System.out.println(user.getKey());
            user.getValue().forEach((k, v) -> System.out.printf("#  %s -> %d%n", k ,v));
        }
    }

    private static void printBestCandidate(Map<String, Map<String, Integer>> users) {
        String topUser = "";
        int points = Integer.MIN_VALUE;

        for (var user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();

            if (sum > points) {
                points = sum;
                topUser = user.getKey();
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n", topUser, points);
    }

    private static void fillUsersAndTheirPointsForContests(Scanner scanner, Map<String, String> contestPassword, Map<String, Map<String, Integer>> users) {
        String input;

        while (!"end of submissions".equals(input = scanner.nextLine())) {
            String[] data = input.split("=>");
            String contest = data[0];
            String password = data[1];
            String username = data[2];
            int points = Integer.parseInt(data[3]);

            boolean isValid = contestPassword.containsKey(contest) && contestPassword.get(contest).equals(password);

            if (isValid) {
                Map<String, Integer> currentContestAndPoints = new HashMap<>();
                currentContestAndPoints.put(contest, points);
                users.putIfAbsent(username, currentContestAndPoints);
                users.get(username).putIfAbsent(contest, points);

                if (users.get(username).get(contest) < points) {
                    users.get(username).put(contest, points);
                }
            }
        }
    }

    private static void fillContestsAndPasswords(Scanner scanner, Map<String, String> contestPassword) {
        String input;

        while (!"end of contests".equals(input = scanner.nextLine())) {
            String[] data = input.split(":");
            String title = data[0];
            String password = data[1];

            contestPassword.put(title, password);
        }
    }
}
