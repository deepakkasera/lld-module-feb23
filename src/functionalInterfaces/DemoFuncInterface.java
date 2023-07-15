package functionalInterfaces;

@FunctionalInterface
public interface DemoFuncInterface {
    void fun(); //Abstract Method -> Method with NO body.

    default void fun1() {
        System.out.println("Default Method of Functional Interface");
    }
}
