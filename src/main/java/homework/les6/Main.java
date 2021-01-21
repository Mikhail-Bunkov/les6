package homework.les6;

//import java.util.Random;

// Старался над супер оригинальными названиями и значениями))
public class Main {
    public static void main(String[] args) {
//        int x;
//        Random random = new Random(); //хотел как-то сделать рандомное создание экземпляров классов. но чет не додумал как.
//        x = random.nextInt()*20;
        Animal animal = new Animal("Зеленое", 123, "Зеленка");
        Cat cat = new Cat("Чорний", 2, "Барсанелло");
        Dog dog = new Dog("Рыжий",4, "Тузик");
        Animal animal1 = new Animal("Зеленое", 123, "Зеленка");
        Cat cat1 = new Cat("Чорний", 2, "Барсанелло");
        Dog dog1 = new Dog("Рыжий",4, "Тузик");
        cat.run(50);
        cat.run(2020);
        dog.run(200);
        dog.run(2020);
        cat.swim(50);
        dog.swim(9);
        dog.swim(2020);
        System.out.println(animal.getIterator());
        System.out.println(cat.getIterator());
        System.out.println(dog.getIterator());
    }
}
