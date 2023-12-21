import javax.swing.*;

public class CarTimer {
    private final int delay = 50;
    
    public Timer timer;
    
    public CarTimer(CarView frame, ScaniaObserverSubject scanOS) {
        timer = new Timer(delay, new TimerListener(frame, scanOS));
    }
}
