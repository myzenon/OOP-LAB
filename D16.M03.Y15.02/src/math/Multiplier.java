package math;

/**
 * Created by Zenon on 16/3/2558.
 */
public class Multiplier extends MathObject {
    public Multiplier(int aValue, int bValue) {
        super(aValue, bValue);
    }

    @Override
    public int compute() {
        return aValue*bValue;
    }
}
