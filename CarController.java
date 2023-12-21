
/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */


public class CarController {
    
    CarView frame; 

    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : CarModule.getCars()) {
            car.gas(gas);
        }
    }
    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Car car : CarModule.getCars()) {
            car.brake(brake);
        }
    }
    void incBed(int amount) {
        for (Scania scania: CarModule.getScania() ) {
            scania.incrementDegree(amount);
        }
    }
    void decBed(int amount) {
        for (Scania scania: CarModule.getScania()) {
            scania.decrementDegree(amount);
        }
    }
    void turnLeft() {
        for (Car car : CarModule.getCars()) {
            car.turnLeft();
        }
    }
    void turnRight() {
        for (Car car : CarModule.getCars()) {
            car.turnRight();
        }
    }

    void turboOn() {  
        Saab95.setTurboOn();
    }

    void turboOff() {
        Saab95.setTurboOff(); 
    }

    void addCar() {
        CarFactory.createVolvo240();
    }

    void carRemove(){
        CarFactory.removeCar();
    }

    void addGas(CarView frame){
        frame.addGasButton();
    }

    void addBrake(CarView frame){
        frame.addBrakeButton();
    }

    void addStop(CarView frame){
        frame.addStopButton();
    }

    void addStart(CarView frame){
        frame.addStartButton();
    }

    void addTurboOn(CarView frame){
        frame.addTurboOnButton();
    }

    void addTurboOff(CarView frame){
        frame.addTurboOffButton();
    }
    
    void addLowerBed(CarView frame){
        frame.addLowerBedButton();
    }

    void addLiftBed(CarView frame){
        frame.addLiftBedButton();
    }

    void addTurnRight(CarView frame){
        frame.addTurnRightButton();
    }

    void addTurnLeft(CarView frame){
        frame.addTurnLeftButton();
    }

    void addAddCar(CarView frame){
        frame.addAddCarButton();
    }

    void addRemoveCar(CarView frame){
        frame.addRemoveCarButton();
    }
}

