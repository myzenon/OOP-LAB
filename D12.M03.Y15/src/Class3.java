
public class Class3 implements Interface1 {
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Class3(int c) {
        setC(c);
    }

    @Override
    public String showMSG() {
        return "This is message from Class3";
    }
}
