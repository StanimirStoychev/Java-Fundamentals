package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Random rnd = new Random();
        for (int i = 0; i < words.size(); i++) {
            int current = rnd.nextInt(words.size());
            System.out.println(words.get(current));
            words.remove(current);
            i--;
        }
    }
}
