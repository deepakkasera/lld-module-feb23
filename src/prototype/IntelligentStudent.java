package prototype;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(){}

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    private IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
