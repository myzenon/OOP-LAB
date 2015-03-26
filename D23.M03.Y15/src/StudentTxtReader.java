

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentTxtReader implements IReadStudentInfo {
    ArrayList<Collegian> collegianlist = new ArrayList();

    public StudentTxtReader() {
    }

    private Collegian ReadCollegianFromString(String cc) {
        String[] array = cc.split(" ");
        Collegian c = new Collegian();
        c.setStudentId(array[0]);
        c.setFirstname(array[1]);
        c.setLastname(array[2]);
        c.setGender(array[3]);
        c.setMarriedStatus(array[4]);
        return c;
    }

    public int ReadStudentDataFromTextFile() throws IOException {
        int i = 0;

        try {
            FileInputStream input = new FileInputStream(new File("/home/zenon/Example.txt"));
            CharsetDecoder e = Charset.forName("UTF-8").newDecoder();
            e.onMalformedInput(CodingErrorAction.IGNORE);
            InputStreamReader reader = new InputStreamReader(input, e);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            Collegian c = this.ReadCollegianFromString(line);
            this.collegianlist.add(c);

            while(line != null) {
                line = bufferedReader.readLine();
                if(line != null) {
                    Collegian c1 = this.ReadCollegianFromString(line);
                    this.collegianlist.add(c1);
                    ++i;
                }
            }

            bufferedReader.close();
        } catch (FileNotFoundException var9) {
            var9.printStackTrace();
        } catch (IOException var10) {
            var10.printStackTrace();
        }

        return i;
    }

    public ArrayList<Collegian> GetAllStudentData() {
        try {
            this.ReadStudentDataFromTextFile();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        return this.collegianlist;
    }

    public void TestPrintoutData() {
        Iterator var1 = this.collegianlist.iterator();

        while(var1.hasNext()) {
            Collegian c = (Collegian)var1.next();
            System.out.println(c.GetStudentInformation());
        }

    }
}
