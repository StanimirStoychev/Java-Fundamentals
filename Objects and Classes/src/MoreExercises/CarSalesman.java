package MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSalesman {

    private static class Car {

        private String model;
        private Engine engine;
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

        public Car setModel(String model) {
            this.model = model;
            return this;
        }

        public Engine getEngine() {
            return engine;
        }

        public Car setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public String getWeight() {
            return weight;
        }

        public Car setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public String getColor() {
            return color;
        }

        public Car setColor(String color) {
            this.color = color;
            return this;
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

        private String model;
        private int power;
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

        public Engine setModel(String model) {
            this.model = model;
            return this;
        }

        public int getPower() {
            return power;
        }

        public Engine setPower(int power) {
            this.power = power;
            return this;
        }

        public String getDisplacement() {
            return displacement;
        }

        public Engine setDisplacement(String displacement) {
            this.displacement = displacement;
            return this;
        }

        public String getEfficiency() {
            return efficiency;
        }

        public Engine setEfficiency(String efficiency) {
            this.efficiency = efficiency;
            return this;
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
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();

        addEngines(scanner, engines);

        //Not working yet.
    }

    private static void addEngines(Scanner scanner, List<Engine> engines) {
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            addEngine(scanner, engines);
        }
    }

    private static void addEngine(Scanner scanner, List<Engine> engines) {
        String[] input = scanner.nextLine().split("\\s+");
        String model = input[0];
        int power = Integer.parseInt(input[1]);

        Engine engine = new Engine(model, power);

        checkInputElements(input, engine);
        engines.add(engine);
    }

    private static void checkInputElements(String[] input, Engine engine) {
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
                    engine.setEfficiency(element);
                } else {
                    engine.setDisplacement(element);
                }
            }
        }
    }
}