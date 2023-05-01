package polymorphism;

public class C extends A {
    String companyName;

    void changeCompanyName(C c, String newCompanyName) {
        c.companyName = newCompanyName;
    }
}
