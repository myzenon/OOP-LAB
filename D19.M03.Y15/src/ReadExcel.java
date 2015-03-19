import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.util.ArrayList;
public class ReadExcel {

    private ArrayList<String> firstname = new ArrayList<String>();
    private ArrayList<String> lastname = new ArrayList<String>();
    private ArrayList<String> num = new ArrayList<String>();
    private ArrayList<String> stuID = new ArrayList<String>();
    private ArrayList<Student> student =  new ArrayList<Student>();
    private String inputFile;

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void read() throws IOException  {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines
           for(int i = 0; i < sheet.getRows(); i++) {
               Cell cell = sheet.getCell(0, i);
               num.add(cell.getContents());
           }
            for(int i = 0; i < sheet.getRows(); i++) {
                Cell cell = sheet.getCell(1, i);
                stuID.add(cell.getContents());
            }
            for(int i = 0; i < sheet.getRows(); i++) {
                Cell cell = sheet.getCell(2, i);
                firstname.add(cell.getContents());
            }
            for(int i = 0; i < sheet.getRows(); i++) {
                Cell cell = sheet.getCell(3, i);
                lastname.add(cell.getContents());
            }
            for(int i = 0; i< lastname.size(); i++) {
                student.add(new Student(Integer.parseInt(num.get(i)), stuID.get(i), firstname.get(i), lastname.get(i)));
            }
            for(Student s : student) {
                System.out.println(s);
            }
//            for (int j = 0; j < sheet.getColumns(); j++) {
//                for (int i = 0; i < sheet.getRows(); i++) {
//                    Cell cell = sheet.getCell(j, i);
//                    CellType type = cell.getType();
//                    if (type == CellType.LABEL) {
//                        System.out.println("I got a label "
//                                + cell.getContents());
//                    }
//
//                    if (type == CellType.NUMBER) {
//                        System.out.println("I got a number "
//                                + cell.getContents());
//                    }
//
//                }
//            }
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ReadExcel test = new ReadExcel();
        test.setInputFile("c:/temp/lars.xls");
        test.read();
    }

} 