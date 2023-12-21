public class CarMain {
    
    CarView frame;
    ScaniaObserverSubject scanOS;

    public static void main(String[] args) {
        // Instance of this class
        CarMain cMain = new CarMain();
        CarModule cm = new CarModule();
        CarController cc = new CarController();
        
        //Initialize the CarView
        cMain.frame = new CarView("CarSim 1.0", cc, cm, CarModule.cars);
        
        //Add action listeners to the buttons
        cc.addGas(cMain.frame);
        cc.addBrake(cMain.frame);
        cc.addTurnLeft(cMain.frame);
        cc.addTurnRight(cMain.frame);
        cc.addAddCar(cMain.frame);
        cc.addRemoveCar(cMain.frame);
        cc.addLiftBed(cMain.frame);
        cc.addLowerBed(cMain.frame);
        cc.addTurboOn(cMain.frame);
        cc.addTurboOff(cMain.frame);
        cc.addStart(cMain.frame);
        cc.addStop(cMain.frame);
        
        // Start a new view and send a reference of self
        CarModule.cars.add(new Volvo240());
        CarModule.cars.add(new Saab95());
        Scania scania = new Scania();
        CarModule.cars.add(scania);
        CarModule.scania.add(scania);
        cMain.scanOS = new ScaniaObserverSubject(scania);
        
        
        
        
        //ScaniaObserver scanO = new TimerListener();
        //ScaniaObserverSubject scanOS = new ScaniaObserverSubject();
        //scanOS.register(scanO);
        TimerListener timerListener = new TimerListener(cMain.frame, cMain.scanOS);
        CarTimer ct = new CarTimer(cMain.frame, cMain.scanOS);
        
        cMain.scanOS.register(timerListener);
        // Start the timer
        ct.timer.addActionListener(timerListener);
        ct.timer.start();
        
        timerListener.scanOS = cMain.scanOS;
    }
}
