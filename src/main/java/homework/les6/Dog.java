package homework.les6;

public class Dog extends Animal {
    private static int iterator;
    private final int maxRunDistance = 500;
    private final int maxSwimmingDistance =10;
    public Dog(String color, int age, String name) {
        super(color, age, name);
        iterator++;
    }
    public static int getIterator() {
        return iterator;
    }
    @Override
    public void run(int distance) {
        if (distance >maxRunDistance)
        {
            System.out.println("Псино пробежало "+maxRunDistance+" и сдохло от усталости...");
        }else
        {
            super.run(distance);
        }
    }
    @Override
    public void swim(int distance) {
        if (distance>maxSwimmingDistance)
        {
            System.out.println("Псино пролыло "+maxRunDistance+ " и уверенно пошло ко дну...");
        }else
        {
            super.swim(distance);;
        }
    }
}
