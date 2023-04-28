package Inheritance;

public class D extends C {
    D() {
        //super("Scaler");
        super("Scaler", 10);
        //If we are using super keyword then it should be the first line in the constructor.
        System.out.println("Constructor of D");
    }
}
