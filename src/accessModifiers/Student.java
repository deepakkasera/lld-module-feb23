package accessModifiers;

public class Student {
    public String name;
    int batchId; //default
    protected double psp;
    private String universityName;

    public Student() {
        name = "Saptarshi";
        batchId = 123;
        psp = 90.0;
        universityName = "XYZ";
    }

    //parametrised constructors.
    public Student(String studentName, int batch, double marks, String college) {
        name = studentName;
        batchId = batch;
        psp = marks;
        universityName = college;
    }

    public Student(String name, int batchId) {
        //this refers to the object of the current class.
        this.name = name;
        this.batchId = 9876;
    }

    public Student(String name) {
        //this refers to the object of the current class.
        this.name = name;
    }

    public Student(Student st) {
        System.out.println("Inside copy constructor");
        this.name = st.name;
        this.batchId = st.batchId;
        this.psp = st.psp;
        this.universityName = st.universityName;
    }

    void doSomething() {
        universityName = "ABC";
        name = "Shivang";
    }
}
