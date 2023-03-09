package MoreExercises;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxDistance = Double.MIN_VALUE;

        double maxx1 = 0.0;
        double maxy1 = 0.0;
        double maxx2 = 0.0;
        double maxy2 = 0.0;

        for (int i = 0; i < 2; i++) {
            double x1 = Double.parseDouble(scanner.nextLine());
            double y1 = Double.parseDouble(scanner.nextLine());
            double x2 = Double.parseDouble(scanner.nextLine());
            double y2 = Double.parseDouble(scanner.nextLine());

            double currentDistance = CalculateDistance(x1, y1, x2, y2);

            if (currentDistance > maxDistance) {
                maxDistance = currentDistance;
                maxx1 = x1;
                maxy1 = y1;
                maxx2 = x2;
                maxy2 = y2;
            }
        }

        GetTheClosestPoint(maxx1, maxy1, maxx2, maxy2);

    }

    static double CalculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        return distance;
    }

    static void GetTheClosestPoint(double x1, double y1, double x2, double y2) {
        if (Math.abs(x1 * x1 + y1 * y1) <= Math.abs(x2 * x2 + y2 * y2)) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
        }
    }
}