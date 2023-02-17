package Lab;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;

        if (age >= 0 && age <= 18) {
            switch (typeOfDay){
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 5;
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.printf("%d$", ticketPrice);
        } else if (age > 18 && age <= 64) {
            switch (typeOfDay){
                case "Weekday":
                    ticketPrice = 18;
                    break;
                case "Weekend":
                    ticketPrice = 20;
                    break;
                case "Holiday":
                    ticketPrice = 12;
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.printf("%d$", ticketPrice);
        } else if (age > 64 && age <= 122) {
            switch (typeOfDay){
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 10;
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.printf("%d$", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
