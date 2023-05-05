package interfaces;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public int walk() {
        System.out.println("Dog is walking");
        return 0;
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    public void run() {
        System.out.println("Dog is walking");
    }
}
