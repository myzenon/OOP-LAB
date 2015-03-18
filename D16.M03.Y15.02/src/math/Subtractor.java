package math;

/**
 * Created by Zenon on 16/3/2558.
 */
public class Subtractor extends MathObject {
    public Subtractor(int aValue, int bValue) {
        super(aValue, bValue);
    }

    @Override
    public int compute() {
        return aValue-bValue;
    }
}
