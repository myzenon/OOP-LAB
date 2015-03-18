
public class Main {
    public static void main(String[] args) {

        // Normal
        Class1 a1 = new Class1(3);
        System.out.println("A1 a val = " + a1.getA());
        System.out.println("////////////////////////////////");
        Class2 a2 = new Class2(4,3);
        a2.setB(43);
        System.out.println("A2 a val = " + a2.getA());
        System.out.println("A2 b val = " + a2.getB());
        System.out.println("A2 says .. " + a2.showMSG());
        System.out.println("////////////////////////////////");
        Class3 a3 = new Class3(5);
        System.out.println("A3 says .. " + a3.showMSG());
        System.out.println("////////////////////////////////");

        //Polymorphism
        Class1 b1 = new Class2(7,8);
        System.out.println("B1 a val = " + b1.getA());
        System.out.println("////////////////////////////////");
        Interface1 b2 = new Class2(10,3);
        System.out.println("B2 says .. " + b2.showMSG());
        System.out.println("////////////////////////////////");
        Interface1 b3 = new Class3(7);
        System.out.println("B3 says .. " + b3.showMSG());
        System.out.println("////////////////////////////////");
        // Show Case
        Object b4 = new Class1(3);
    }
}
