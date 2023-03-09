package MoreExercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String value = scanner.nextLine();

        printResult(type, value);
    }

    private static void printResult(String type, String value) {

        switch (type) {
            case "int":
                int number = Integer.parseInt(value);
                System.out.println(intType(number));
                break;
            case "real":
                double real = Double.parseDouble(value);
                System.out.printf("%.2f", realType(real));
                break;
            case "string":
                System.out.println(stringType(value));
                break;
        }
    }

    private static int intType(int number) {
        return number * 2;
    }

    private static double realType(double number) {
        return number * 1.5;
    }

    private static String stringType(String text){
        return String.format("$%s$", text);
    }
}
