package math;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Zenon on 16/3/2558.
 */
public class Main {
    public static void main(String[] args) {
        List<MathObject> objList = new ArrayList<MathObject>();
        objList.add(new MathObject(1,2));
        objList.add(new Adder(4,5));
        objList.add(new Subtractor(6,7));
        objList.add(new Multiplier(2,2));
        objList.add(new GetMaxValue(110,100));
        for(MathObject mathObject : objList) {
            System.out.println(mathObject.compute());
        }
    }
}
