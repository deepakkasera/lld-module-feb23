package interfaces;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public int walk() {
        System.out.println("Cat is walking");
        return 0;
    }

    public void meow() {
        System.out.println("Meow");
    }
}
