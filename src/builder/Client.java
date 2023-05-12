package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Ankit");
//        builder.setAge(25);
//        builder.setPsp(99.00);
//        builder.setUniversityName("ABC");
//        builder.setGradYear(2010);
//
//        Student student = new Student(builder);
//        System.out.println("DEBUG");

        // Student st2 = new Student(builder);

        Student student = Student.getBuilder()
                                 .setName("Renu")
                                 .setAge(25)
                                 .setPsp(90.00)
                                 .setUniversityName("ABC")
                                 .setGradYear(2010)
                                 .build();

        //student.setPsp(100);

        System.out.println("DEBUG");
    }
}
