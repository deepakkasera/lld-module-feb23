package polymorphism;

public class A {
    String name;
    int age;

    void changeName(A a, String newName) {
        a.name = newName;
    }
}
