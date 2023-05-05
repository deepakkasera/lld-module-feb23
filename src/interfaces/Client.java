package interfaces;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.walk();
        animal.eat();
        animal.run();
        // animal.meow();
//
//        Cat cat = new Cat();
//        cat.meow();
    }
}
