package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "int":
                int first1 = Integer.parseInt(first);
                int second2 = Integer.parseInt(second);
                System.out.println(getMax(first1, second2));
                break;
            case "char":
            case "string":
                System.out.println(getMax(first, second));
                break;
        }
    }

    static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
