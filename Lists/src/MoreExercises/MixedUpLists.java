package MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = readListOfIntegersSeparatedBySpace(scanner);
        List<Integer> second = readListOfIntegersSeparatedBySpace(scanner);

        boolean isFirstBigger = whichListIsWithBiggerSize(first, second);

        int length = getTheSmallestSizeOfList(first, second, isFirstBigger);

        List<Integer> result = new ArrayList<>();

        mainAction(first, second, length, result, isFirstBigger);

        Collections.sort(result);

        printResult(result);

    }

    private static List<Integer> readListOfIntegersSeparatedBySpace(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static void printResult(List<Integer> result) {
        result.forEach(e -> System.out.print(e + " "));
    }

    private static void mainAction(List<Integer> first, List<Integer> second, int length, List<Integer> result
            , boolean firstIsBigger) {
        int min = 0;
        int max = 0;
        if (firstIsBigger) {
            min = getMin(first);
            max = getMax(first);
        } else {
            min = Math.min(second.get(0), second.get(1));
            max = Math.max(second.get(0), second.get(1));
            second.remove(0);
            second.remove(0);
        }

        for (int i = 0; i < length; i++) {
            int currentFirst = first.get(i);
            int currentSecond = second.get(i);
            addNumbersWithCondition(result, min, max, currentFirst, currentSecond);
        }
    }

    private static int getMax(List<Integer> list) {
        int max;
        max = Math.max(list.get(list.size() - 1), list.get(list.size() - 2));
        return max;
    }

    private static int getMin(List<Integer> list) {
        int min;
        min = Math.min(list.get(list.size() - 1), list.get(list.size() - 2));
        return min;
    }

    private static void addNumbersWithCondition(List<Integer> result, int min, int max, int currentFirst, int currentSecond) {
        if (currentFirst > min && currentFirst < max) {
            result.add(currentFirst);
        }
        if (currentSecond > min && currentSecond < max) {
            result.add(currentSecond);
        }
    }

    private static int getTheSmallestSizeOfList(List<Integer> first, List<Integer> second, boolean firstIsBigger) {
        int length;
        if (firstIsBigger) {
            length = second.size();
        } else {
            length = first.size();
        }
        return length;
    }

    private static boolean whichListIsWithBiggerSize(List<Integer> first, List<Integer> second) {

        boolean isFirstBigger = false;
        if (first.size() > second.size()) {
            isFirstBigger = true;
        }
        return isFirstBigger;
    }
}
