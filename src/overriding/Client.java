package overriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething();

        a = new B();
        a.doSomething();

        a = new C();
        a.doSomething();

        // B b = new A();

    }
}
