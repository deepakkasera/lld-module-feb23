package builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private int gradYear;

    //private int comp = 100000;

    //getBuilder() -> returns the object of builder from the Student class.
    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder builder) {
        //Validations start
        if (builder.getGradYear() < 2015) {
            throw new IllegalArgumentException("Grad Year can't be less than 2015");
        }

        //Validations end.

        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
    }

    //Builder Class.
    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private int gradYear;

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getName() {
            return name;
        }

        // obj.setName("Deepak").setPsp(90).setUni...
        //obj -> builder
        // return obj -> this.
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Student build() {
            //this -> reference of the current object.
            return new Student(this);
        }
    }


}
