
public class Main {
    public static void main(String[] args) {
        ReadExcel readExcel = new ReadExcel();
        readExcel.setInputFile("/home/zenon/excel.xls");
        try {
            readExcel.read();
        }
        catch (Exception e) {};
    }
}
