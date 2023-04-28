package Inheritance;

public class B extends A{
    B() {
        System.out.println("Constructor of B");
    }

    B(String name) {
        System.out.println("Constructor of B " + name);
    }
}
