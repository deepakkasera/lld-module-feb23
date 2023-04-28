package Inheritance;

public class C extends B {
    C() {
        System.out.println("Constructor of C");
    }

    C(String name) {
        //Without super -> default constructor of the parent class will be executed.
        System.out.println("Constructor of C " + name);
    }

    C(String name, int x) {
        super("Aditi");
        System.out.println("Constructor of C " + name + " " + x);
    }
}
