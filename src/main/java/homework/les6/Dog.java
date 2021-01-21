package homework.les6;

public class Dog extends Animal {
    private static int iterator;
    private final int maxRunDistance = 500;
    private final int maxSwimmingDistance =10;
    public Dog(String color, int age, String name) {
        super(color, age, name);
        iterator++;
    }
}
