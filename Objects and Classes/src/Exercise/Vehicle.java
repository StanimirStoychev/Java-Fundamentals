package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public record Vehicle(String type, String model, String color, int horsepower) {

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                        "Model: %s%n" +
                        "Color: %s%n" +
                        "Horsepower: %d", type().toUpperCase().charAt(0) + this.type().substring(1),
                model(), color(), horsepower());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        fillTheListsWithVehiclesByType(scanner, cars, trucks);

        printDesiredVehiclesByModel(scanner, cars, trucks);

        printAverageHorsepower("Cars", cars);
        printAverageHorsepower("Trucks", trucks);
    }

    private static void printAverageHorsepower(String type, List<Vehicle> vehicles) {
        System.out.printf("%s have average horsepower of: %.2f.%n", type, average(vehicles));
    }

    private static void printDesiredVehiclesByModel(Scanner scanner, List<Vehicle> cars, List<Vehicle> trucks) {
        String model;

        while (!"Close the Catalogue".equals(model = scanner.nextLine())) {
            String finalModel = model;
            cars.stream()
                    .filter(v -> v.model().equals(finalModel))
                    .forEach(System.out::println);
            trucks.stream()
                    .filter(v -> v.model().equals(finalModel))
                    .forEach(System.out::println);
        }
    }

    private static double average(List<Vehicle> vehicles) {
        return vehicles.stream()
                .mapToDouble(Vehicle::horsepower).average().orElse(0);
    }

    private static void fillTheListsWithVehiclesByType(Scanner scanner, List<Vehicle> cars, List<Vehicle> trucks) {
        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            String[] data = command.split("\\s+");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsepower = Integer.parseInt(data[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            switch (type) {
                case "car" -> cars.add(vehicle);
                case "truck" -> trucks.add(vehicle);
            }
        }
    }
}
