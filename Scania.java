import java.awt.*;

public class Scania extends Truck {    

    private double currentDegree = 0;

    public Scania(){
        super(2,95,"Scania",Color.BLACK,0,100,0);
    }

    public double getCurrentDegree(){
        return currentDegree;
    }

    public void incrementDegree(double amount) {
        if(currentSpeed == 0) 
            currentDegree = Math.min(getCurrentDegree() + amount, 70);
            checkRampdown();
    }

    public void decrementDegree(double amount) {
        if(currentSpeed == 0)
            currentDegree = Math.max(getCurrentDegree() - amount, 0);
            checkRampdown();
    }

    public void checkRampdown(){
        if(currentDegree > 0)
            rampdown = true;
        else rampdown = false;
    } 

    public double getScanSpeed() {
        return getCurrentSpeed();
    }

    /* det här ska in i den som tittar på observern
     
    private double scanSpeed;
    public void update(double scanSpeed){
        this.scanSpeed=scanSpeed;
        
    }
    */

    //public double returnScaniaSpeed() {
    //    return getCurrentSpeed();
    //}

}