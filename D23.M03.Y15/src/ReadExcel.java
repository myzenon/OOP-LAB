

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel implements IReadStudentInfo {
    private ArrayList<Collegian> collegians = new ArrayList();
    private String inputFile;

    public ReadExcel() {
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void readExcelFile() throws IOException {
        this.setInputFile("/home/zenon/excel.xls");
        File inputWorkbook = new File(this.inputFile);

        try {
            Workbook w = Workbook.getWorkbook(inputWorkbook);
            Sheet e = w.getSheet(0);

            for(int i = 0; i < e.getRows(); ++i) {
                Collegian c = new Collegian();
                c.setStudentId(e.getCell(1, i).getContents());
                c.setFirstname(e.getCell(2, i).getContents());
                c.setLastname(e.getCell(3, i).getContents());
                this.collegians.add(c);
            }
        } catch (BiffException var6) {
            var6.printStackTrace();
        }

    }

    public ArrayList<Collegian> GetAllStudentData() {
        try {
            this.readExcelFile();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        return this.collegians;
    }
}
