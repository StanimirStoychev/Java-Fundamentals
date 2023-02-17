package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double singlePrice = 0;

        switch (group){
            case "Students":
                switch (day) {
                    case "Friday":
                        singlePrice = 8.45;
                        break;
                    case "Saturday": singlePrice = 9.8;
                    break;
                    case "Sunday": singlePrice = 10.46;
                    break;
                }
                if (number >= 30) {
                    singlePrice *= 0.85;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday": singlePrice = 10.9;
                    break;
                    case "Saturday": singlePrice = 15.6;
                    break;
                    case "Sunday": singlePrice = 16;
                    break;
                }
                if (number >= 100) {
                    number -= 10;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday": singlePrice = 15;
                    break;
                    case "Saturday": singlePrice = 20;
                    break;
                    case "Sunday": singlePrice = 22.5;
                    break;
                }
                if (number >= 10 && number <= 20) {
                    singlePrice *= 0.95;
                }
                break;
        }

            double totalPrice = singlePrice * number;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
