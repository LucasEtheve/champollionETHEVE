package champollion;

public class ServicePrevu {
    public int volumeCM = 0;
    public int volumeTD = 0;
    public int volumeTP = 0;
    
    public ServicePrevu(int CM, int TD, int TP) {
        volumeCM = CM;
        volumeTD = TD;
        volumeTP = TP;
    }
    
    public void adheure (double CM, double TD, double TP){
        volumeCM += CM;
        volumeTD += TD;
        volumeTP += TP;
    }
}
