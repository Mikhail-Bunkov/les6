package homework.les6;

public class Animal {
    private String color;
    private int age;
    private String name;
    private static int iterator;
    public Animal(String color, int age, String name)
    {
        this.color = color;
        this.age = age;
        this.name = name;
        iterator++;
    }
    public void run(int distance)
    {
        System.out.println(name + " пробежал "+ distance);
    }
}
