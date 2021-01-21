package homework.les6;

public class Cat extends Animal {
    private static int iterator;
    private final int maxRunDistance = 200;
    private final int maxSwimmingDistance =0;
    public Cat(String color, int age, String name) {
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
            System.out.println("Котэ пробежало "+maxRunDistance+" и сдохло от усталости...");
        }else
            {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (true)
        {
            System.out.println("Котэ уверенно пошел ко дну");
        }else
        {
            super.swim(distance);;
        }
    }
}
