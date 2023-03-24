package MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData {

    private record Engine(int speed, int power) {}

    private record Cargo(int weight, String type) {}

    private record Tire(double pressure, int age) {}

    private static class Car {

        private final String model;
        private final Engine engine;
        private final Cargo cargo;
        private List<Tire> tires;

        public Cargo getCargo() {
            return cargo;
        }

        public Car(String model, Engine engine, Cargo cargo, List<Tire> tires){
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            setTires(tires);
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }

        public List<Tire> getTires() {
            return tires;
        }

        public void setTires(List<Tire> tires) {
            this.tires = tires;
        }

        @Override
        public String toString() {
            return getModel();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>(n);

        addCars(scanner, n, cars);

        printOutputByType(scanner, cars);
    }

    private static void printOutputByType(Scanner scanner, List<Car> cars) {
        String type = scanner.nextLine();

        switch (type) {
            case "fragile" -> cars.stream()
                    .filter(c -> c.getTires()
                            .stream().anyMatch(t -> t.pressure() < 1) && c.getCargo().type.equals("fragile"))
                    .forEach(System.out::println);
            case "flamable" -> cars.stream()
                    .filter(c -> c.getEngine().power() > 250 && c.getCargo().type.equals("flamable"))
                    .forEach(System.out::println);
        }
    }

    private static void addCars(Scanner scanner, int n, List<Car> cars) {
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            addCar(cars, info);
        }
    }

    private static void addCar(List<Car> cars, String[] info) {
        String model = info[0];

        int speed = Integer.parseInt(info[1]);
        int power = Integer.parseInt(info[2]);
        Engine engine = new Engine(speed, power);

        int weight = Integer.parseInt(info[3]);
        String type = info[4];
        Cargo cargo = new Cargo(weight, type);

        List<Tire> tires = new ArrayList<>();
        addTires(info, tires);
        Car car = new Car(model, engine, cargo, tires);
        cars.add(car);
    }

    private static void addTires(String[] info, List<Tire> tires) {
        for (int j = 5; j < info.length; j += 2) {
            double pressure = Double.parseDouble(info[j]);
            int age = Integer.parseInt(info[j + 1]);
            Tire tire = new Tire(pressure, age);
            tires.add(tire);
        }
    }
}