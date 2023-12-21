import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;



public class TimerListener implements ActionListener, ScaniaObserver {
    CarView frame;
    ScaniaObserverSubject scanOS;
    
    private double scanSpeed;

    public void update(double scanSpeed){
        this.scanSpeed=scanSpeed;
        
        DecimalFormat decimalRound = new DecimalFormat("0.00");
        
        String scaniaSpeedString = decimalRound.format(this.scanSpeed);
        frame.scaniaField.setText(scaniaSpeedString);
    }
    

    public TimerListener(CarView frame, ScaniaObserverSubject scanOS) {
        this.frame = frame;
        this.scanOS = scanOS;
    }

    public void actionPerformed(ActionEvent e) {        
        scanOS.scaniaSpeedChanged();
    
        int i = 0;
        for (Car car : CarModule.getCars()) {
            DrawPanel drawPanel = frame.drawPanel;
            DrawPanel.addPoints();
            car.move();
            int x = (int) Math.round(car.getCurrentXpos());  //Kan kanske ta bort round
            int y = (int) Math.round(car.getCurrentYpos());
            drawPanel.moveit(x, y, i);
            i++;
                // repaint() calls the paintComponent method of the panel
            drawPanel.repaint();
        }
    }
}