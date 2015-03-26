
public class Collegian extends Person {
    private String studentId;

    public Collegian() {
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String GetStudentInformation() {
        String s = "";
        s = s + this.studentId + " ";
        s = s + super.GetFullName();
        return s;
    }
}
