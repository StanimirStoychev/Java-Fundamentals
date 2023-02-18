package Exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = 0;

        if (peopleCount % capacity == 0) {
            courses = peopleCount / capacity;
        } else {
            courses = peopleCount / capacity + 1;
        }

        System.out.println(courses);
    }
}
