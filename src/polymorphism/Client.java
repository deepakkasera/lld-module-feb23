package polymorphism;

public class Client {
    public static void main(String[] args) {
        A a = new C();

        C c = (C) a;
        c.changeCompanyName(c, "Microsoft");

        a.changeName(a, "Keerthana");
        // type of the variable - A
        // compiler only knows about A.
        // Object is created at run time.

        // a.companyName; //Compile Time Error.
        a.name = "Rajat";
        a.age = 25;

        // C c = new A();
        //Can't store the object of parent clas into child class reference.

        // c.companyName = "Google";

        // C c1 = (C) new A(); -> Run time error
        //c1.changeCompanyName(c1, "Walmart");

        C c2 = new C();
        c2.companyName = "Amazon";
        c2.changeCompanyName(c2, "Arcesium");

        //A a2 = new A();
        //a2.name = "Deepak";
        //a2.changeName(a2, "Saptarshi");
    }
}
