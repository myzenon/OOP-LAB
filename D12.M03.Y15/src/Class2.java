
public class Class2 extends Class1 implements Interface1 {
    private int b;

    public Class2(int a, int b) {
        super(a);
        setB(b);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String showMSG() {
        return "This is message from Class2";
    }
}
