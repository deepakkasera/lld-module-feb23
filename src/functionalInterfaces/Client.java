package functionalInterfaces;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {
        //Can we create an object of an interface ? -> NO.
        //Because interfaces are incomplete (Methods without body).

        DemoFuncInterface way1 = new DemoClass();
        way1.fun();

        //To create an instance of the interface, we'll have
        //to implement its method.
        DemoFuncInterface way2 = new DemoFuncInterface() {
            @Override
            public void fun() {
                System.out.println("fun method");
            }
        };
        way2.fun();

        BiPredicate<String, String> obj = new DemoClass2();
        System.out.println(obj.test("Hello", "Hey"));
    }
}
