package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    private static class Person {

        private String name;
        private String ID;
        private int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", getName(), getID(), getAge());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Person> people = new ArrayList<>();

            readInfoAndFillTheList(scanner, people);

            sortByAge(people);

            people.forEach(System.out::println);
        }

        private static void sortByAge(List<Person> people) {
            people.sort(Comparator.comparingInt(Person::getAge));
        }

        private static void readInfoAndFillTheList(Scanner scanner, List<Person> people) {
            String command;
            while (!"End".equals(command = scanner.nextLine())) {
                String[] info = command.split(" ");
                String name = info[0];
                String ID = info[1];
                int age = Integer.parseInt(info[2]);

                Person person = new Person(name, ID, age);
                people.add(person);
            }
        }
    }
}
