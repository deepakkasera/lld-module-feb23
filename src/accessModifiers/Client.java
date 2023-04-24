package accessModifiers;

public class Client {
    public static void main(String[] args) {
        int x = 10;
        Student student = new Student();

        System.out.println("DEBUG");
        // new keyword is responsible for creating a new object.
        // new keyword creates a new memory/object in the HEAP.
        // DOT operator

        //student.universityName = "ABC";
        student.name = "Deepak";
        student.psp = 90.0;
        student.batchId = 123;

        Student student1 = new Student("Hitesh", 456, 91.0, "IIT");
        System.out.println("DEBUG");

        Student student2 = new Student("Rajat", 56789);
        System.out.println("DEBUG");

        Student student3 = new Student("Nitesh");
        System.out.println("DEBUG");


        //student and student4, both of these objects will point to the same memory location.
        Student student4 = student;
        student4.name = "Rajat";
        System.out.println("DEBUG");

        Student student5 = new Student(student);
        System.out.println("DEBUG");
    }
}
