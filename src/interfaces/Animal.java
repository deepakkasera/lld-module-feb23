package interfaces;

public interface Animal {
    void eat();

    int walk();

    default void run() {
        System.out.println("Animal is running");
    }
}
