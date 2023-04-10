package MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {

        Map<String, LinkedHashMap<String, Integer>> contests = new LinkedHashMap<>();

        fillTheMap(contests);

        printSortedContestsAndMembers(contests);

        printStandings(contests);
    }

    private static void printStandings(Map<String, LinkedHashMap<String, Integer>> contests) {
        Map<String, Integer> standings = new LinkedHashMap<>();
        AtomicInteger num = new AtomicInteger(1);

        for (var contest : contests.entrySet()) {
            for (var person : contest.getValue().entrySet()) {
                standings.putIfAbsent(person.getKey(), 0);
                standings.put(person.getKey(), standings.get(person.getKey()) + person.getValue());
            }
        }

        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(element ->
                System.out.printf("%d. %s -> %d%n", num.getAndIncrement(), element.getKey(), element.getValue()));
    }

    private static void printSortedContestsAndMembers(Map<String, LinkedHashMap<String, Integer>> contests) {
        AtomicInteger num = new AtomicInteger(1);

        contests.forEach((key, value) -> {
            num.set(1);
            System.out.println(key + ": " + value.size() + " participants");
            value.entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());
                }
                return sort;
            }).forEach(element ->
                    System.out.printf("%d. %s <::> %d%n", num.getAndIncrement(), element.getKey(), element.getValue()));
        });
    }

    private static void fillTheMap(Map<String, LinkedHashMap<String, Integer>> contests) {
        Scanner scanner = new Scanner(System.in);

        String input;

        while (!"no more time".equals(input = scanner.nextLine())) {
            String[] info = input.split(" -> ");
            String name = info[0];
            String contest = info[1];
            int points = Integer.parseInt(info[2]);

            contests.putIfAbsent(contest, new LinkedHashMap<>());
            contests.get(contest).putIfAbsent(name, points);
            if (contests.get(contest).get(name) < points) {
                contests.get(contest).put(name, points);
            }
        }
    }
}
