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
        System.out.println(name + " пробежало "+ distance);
    }
    public void swim(int distance)
    {
        System.out.println(name + " проплыло "+ distance);
    }
    public static int getIterator() {
        return iterator;
    }
}
