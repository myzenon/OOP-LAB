import java.util.ArrayList;

/**
 * Created by zenon on 26/3/2558.
 */
public class Travel {
    private ArrayList<TravelLog> travelLogs;

    public Travel() {
        this.travelLogs = new ArrayList<TravelLog>();
    }

    public void startTravel(String date, String startTime) {
        TravelLog tl = new TravelLog();
        tl.date = date;
        tl.startTime = startTime;
        travelLogs.add(tl);
    }

    public void sendSPD(double speed) {
        TravelLog tl = travelLogs.get(travelLogs.size()-1);
        tl.speed.add(speed);
    }

    public void endTravel(double distance, double temperature, double elevation, String endTime) {
        TravelLog tl = travelLogs.get(travelLogs.size()-1);
        tl.distance = distance;
        tl.temperature = temperature;
        tl.elevation = elevation;
        tl.endTime = endTime;
    }


    private double kmTomph(double km) {
        return km * 0.621371192;
    }

    public void showDistance() {
        double allDistance = 0;
        for(TravelLog tl : travelLogs) {
            allDistance += tl.distance;
            System.out.println(tl.date + " ( " + tl.startTime + " - " + tl.endTime  + " ) => Total Distance : " + tl.distance + " km | " +  kmTomph(tl.distance) + " mph");
        }
        System.out.println(" All Distance is : " + allDistance + " km | " +  kmTomph(allDistance) + " mph");
    }

    public double showAvgSPDAll() {
        double avgSPDAll = 0;
        for(TravelLog tl : travelLogs) {
            double avgSPD = tl.showAvgSPD();
            if(avgSPD >= 3) {
                avgSPDAll += avgSPD;
            }
        }
        return avgSPDAll;
    }

    public double showMaxSPDAll() {
        double maxSPDAll = 0;
        for(TravelLog tl : travelLogs) {
            double maxSPD = tl.showMaxSPD();

                maxSPDAll += maxSPD;

        }
        return maxSPDAll;
    }

    public void showPerSPDAll() {
        for(TravelLog tl : travelLogs) {
            System.out.println(tl.date + " ( " + tl.startTime + " - " + tl.endTime  + " ) => Percentage of Speed : " + (tl.showAvgSPD() / showMaxSPDAll()) + " %");
        }
    }


}
