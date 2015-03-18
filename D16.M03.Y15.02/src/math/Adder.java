package math;

/**
 * Created by Zenon on 16/3/2558.
 */
public class Adder extends MathObject {
    public Adder(int aValue, int bValue) {
        super(aValue, bValue);
    }

    @Override
    public int compute() {
        return aValue+bValue;
    }
}
