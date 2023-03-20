package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        addPeople(scanner, people, n);

        printResult(people);
    }

    private static void printResult(List<Person> people) {
        people.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);
    }

    private static void addPeople(Scanner scanner, List<Person> people, int n) {
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            Person person = new Person(name, age);
            people.add(person);
        }
    }
}
