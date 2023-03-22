package Exercise.GroomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Pet setAge(int age) {
        this.age = age;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public Pet setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %d - (%s)", getName(), getAge(), getOwner());
    }
}
