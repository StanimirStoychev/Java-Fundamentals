package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d", getType().toUpperCase().charAt(0) + this.getType().substring(1),
                getModel(), getColor(), getHorsepower());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        fillTheListsWithVehiclesByType(scanner, cars, trucks);

        printDesiredVehiclesByModel(scanner, cars, trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", average(cars));
        System.out.printf("Trucks have average horsepower of: %.2f.", average(trucks));
    }

    private static void printDesiredVehiclesByModel(Scanner scanner, List<Vehicle> cars, List<Vehicle> trucks) {
        String model;

        while (!"Close the Catalogue".equals(model = scanner.nextLine())) {
            String finalModel = model;
            cars.stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);
            trucks.stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);
        }
    }

    private static double average(List<Vehicle> vehicles) {
        return vehicles.stream()
                .mapToDouble(Vehicle::getHorsepower).average().orElse(0);
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
                case "car":
                    cars.add(vehicle);
                    break;
                case "truck":
                    trucks.add(vehicle);
                    break;
            }
        }
    }
}
