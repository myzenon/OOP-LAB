import java.util.ArrayList;

/**
 * Created by zenon on 26/3/2558.
 */
public class TravelLog {
    String date;
    String startTime;
    String endTime;
    double elevation;
    double distance;
    ArrayList<Double> speed = new ArrayList<Double>();
    double temperature;

    public double showAvgSPD(){
        double avg = 0;
        int count = 0;
        for(double a : speed){
            if(a >= 3) {
                avg += a;
                count++;
            }
        }
        if(count == 0) {
            return 0;
        }
        return avg/count;

    }

    public double showMaxSPD(){
        double max = 0;
        for(double a : speed){
            if(max < a) max = a;
        }
        return max;
    }


}
