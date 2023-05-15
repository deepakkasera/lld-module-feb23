package prototype;

public class Client {
    private static void fillRegistry(StudentRegistry registry) {
        Student apr22Batch = new Student();
        apr22Batch.setBatch("Apr22 Intermediate");
        apr22Batch.setBatchAvgPsp(75.0);

        registry.register("apr22Batch", apr22Batch);

        IntelligentStudent apr22IntelligentStudent = new IntelligentStudent();
        apr22IntelligentStudent.setBatch("Apr22 Intermediate");
        apr22IntelligentStudent.setBatchAvgPsp(95.0);
        apr22IntelligentStudent.setIq(150);

        registry.register("apr22IntelligentStudent", apr22IntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        //ajith belongs to apr22 batch
        Student ajith = registry.get("apr22Batch").clone();
        ajith.setName("Ajith");
        ajith.setAge(20);
        ajith.setPsp(89.0);

        Student shubham = registry.get("apr22Batch").clone();
        shubham.setName("Shubham");
        shubham.setAge(21);
        shubham.setPsp(90.0);

        Student karan = registry.get("apr22IntelligentStudent").clone();
        karan.setName("karan");
        karan.setAge(22);
        karan.setPsp(99.0);

        System.out.println("debug");
    }
}
