package math;

/**
 * Created by Zenon on 16/3/2558.
 */
public class GetMaxValue extends MathObject {
    public GetMaxValue(int aValue, int bValue) {
        super(aValue, bValue);
    }
    public int compute() {
        if(aValue > bValue) {
            return aValue;
        }
        return bValue;
    }
}
