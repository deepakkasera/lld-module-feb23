package interfaces;

public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public int walk() {
        return 0;
    }
}
