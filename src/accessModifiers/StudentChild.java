package accessModifiers;

public class StudentChild extends Student {
    //StudentChild is a child class of Student.

    public void demo() {
        psp = 100.0;
        name = "Ankit";
        batchId = 543;
        //universityName = "XYZ"; -> private field isn't accessible from outside the class.
    }
}
