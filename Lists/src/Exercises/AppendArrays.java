package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = input.size() - 1; i >= 0; i--) {
            String list = input.get(i);
            List<String> numbers = Arrays.stream(list.split("\\s+")).collect(Collectors.toList());
            for (int j = 0; j < numbers.size(); j++) {
                if (!"".equals(numbers.get(j))) {
                    System.out.printf("%s ", numbers.get(j));
                }
            }
        }
    }
}
