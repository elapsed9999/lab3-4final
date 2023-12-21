import java.util.List;
import java.util.ArrayList;

interface Subject{
    void register(ScaniaObserver obj);
    void unregister(ScaniaObserver obj);
    void notifyObserver(double scanSpeed);
}

public class ScaniaObserverSubject implements Subject {
    Scania scania;
    private List<ScaniaObserver> observers;
    
    public ScaniaObserverSubject(Scania scania) {
        this.observers = new ArrayList<>();
        this.scania = scania;
    }

    @Override 
    public void register(ScaniaObserver obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(ScaniaObserver obj){
        observers.remove(obj);
    }

    @Override
    public void notifyObserver(double scanSpeed) {
        for(ScaniaObserver obj: observers){
            obj.update(scanSpeed);
        }
    }

    public void scaniaSpeedChanged() {
        double scanSpeed = scania.getScanSpeed();
        notifyObserver(scanSpeed);
        
    }
        
}
