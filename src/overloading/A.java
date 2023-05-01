package overloading;

public class A {
    void printHello() {
        System.out.println("Hello");
    }

    void printHello(String name) {
        System.out.println("Hello " + name);
    }

//    int printHello(String s) {
//
//    }

    void scaler(Integer integer) {
        System.out.println("Hello Integer");
    }

    void scaler(int x) {
        System.out.println("Hello int");
    }

    void scaler(Object o){
        System.out.println("Hello Object");
    }
}
