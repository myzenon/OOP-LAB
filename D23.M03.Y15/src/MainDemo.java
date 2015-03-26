import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MainDemo {
    public MainDemo() {
    }

    public static void main(String[] args) throws IOException {
        Collegian s = new Collegian();
        s.setFirstname("Test");
        s.setLastname("Test");
        s.setMarriedStatus("Single");
        s.setGender("Female");
        s.setStudentId("5555555");
        System.out.println(s.GetStudentInformation());
        StudentTxtReader sm = new StudentTxtReader();
        sm.ReadStudentDataFromTextFile();
        sm.TestPrintoutData();
        ArrayList clist = new ArrayList();
        clist.addAll(sm.GetAllStudentData());
        System.out.println("------------------------------------------------------------");
        ArrayList cg = new ArrayList();
        StudentTxtReader irsi1 = new StudentTxtReader();
        Iterator irsi2 = irsi1.GetAllStudentData().iterator();

        while(irsi2.hasNext()) {
            Collegian c = (Collegian)irsi2.next();
            cg.add(c);
        }

        ReadExcel irsi21 = new ReadExcel();
        Iterator c2 = irsi21.GetAllStudentData().iterator();

        Collegian c1;
        while(c2.hasNext()) {
            c1 = (Collegian)c2.next();
            cg.add(c1);
        }

        c2 = cg.iterator();

        while(c2.hasNext()) {
            c1 = (Collegian)c2.next();
            System.out.println(c1.GetStudentInformation());
        }

    }
}
