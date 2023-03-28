package MoreExercises;

import java.util.*;

public class CarSalesman {

    private static class Car {

        private final String model;
        private final Engine engine;
        private String weight;
        private String color;

        public Car(String model, Engine engine) {
            this.model = model;
            this.engine = engine;
            this.weight = "n/a";
            this.color = "n/a";
        }

        public String getModel() {
            return model;
        }


        public Engine getEngine() {
            return engine;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format("%s:%n" +
                    "%s%n" +
                    "Weight: %s%n" +
                    "Color: %s", getModel(), getEngine().toString(), getWeight(), getColor());
        }
    }

    private static class Engine {

        private final String model;
        private final int power;
        private String displacement;
        private String efficiency;

        public Engine(String model, int power) {
            this.model = model;
            this.power = power;
            this.displacement = "n/a";
            this.efficiency = "n/a";
        }

        public String getModel() {
            return model;
        }

        public int getPower() {
            return power;
        }

        public String getDisplacement() {
            return displacement;
        }

        public void setDisplacement(String displacement) {
            this.displacement = displacement;
        }

        public String getEfficiency() {
            return efficiency;
        }

        public void setEfficiency(String efficiency) {
            this.efficiency = efficiency;
        }

        @Override
        public String toString() {
            return String.format("%s:%n" +
                    "Power: %d%n" +
                    "Displacement: %s%n" +
                    "Efficiency: %s", getModel(), getPower(), getDisplacement(), getEfficiency());
        }
    }

    public static void main(String[] args) {

        List<Engine> engines = new ArrayList<>();

        addEngines(engines);

        printDesiredCars(engines);
    }

    private static void printDesiredCars(List<Engine> engines) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Car car = addCar(engines);
            printCarInfo(car);
        }
    }

    private static void printCarInfo(Car car) {
        System.out.println(car);
    }

    private static Car addCar(List<Engine> engines) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split("\\s+");
        String model = info[0];
        Engine engine = engines.stream().filter(e -> e.getModel().equals(info[1])).findFirst().orElseThrow(NoSuchElementException::new);
        Car car = new Car(model, engine);
        checkInputElementsForCar(info, car);
        return car;
    }

    private static void addEngines(List<Engine> engines) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            addEngine(engines);
        }
    }

    private static void addEngine(List<Engine> engines) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String model = input[0];
        int power = Integer.parseInt(input[1]);

        Engine engine = new Engine(model, power);

        checkInputElementsForEngine(input, engine);
        engines.add(engine);
    }

    private static void checkInputElementsForEngine(String[] input, Engine engine) {
        if (input.length >= 3) {
            String element = input[2];
            if (element.charAt(0) >= 48 && element.charAt(0) <= 57) {
                engine.setDisplacement(element);
            } else {
                engine.setEfficiency(element);
            }
            if (input.length >= 4) {
                element = input[3];
                if (engine.getDisplacement().equals("n/a")) {
                    engine.setDisplacement(element);
                } else {
                    engine.setEfficiency(element);
                }
            }
        }
    }

    private static void checkInputElementsForCar(String[] info, Car car) {
        if (info.length >= 3) {
            String element = info[2];
            if (element.charAt(0) >= 48 && element.charAt(0) <= 57) {
                car.setWeight(element);
            } else {
                car.setColor(element);
            }
            if (info.length >= 4) {
                element = info[3];
                if (car.getWeight().equals("n/a")) {
                    car.setWeight(element);
                } else {
                    car.setColor(element);
                }
            }
        }
    }
}