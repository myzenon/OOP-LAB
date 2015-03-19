/**
 * Created by zenon on 19/3/2558.
 */
public class Student {
    int num;;
    String stuID, firstname,lastname;

    public Student(int num, String stuID, String firstname, String lastname) {
        this.num = num;
        this.stuID = stuID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", stuID='" + stuID + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
