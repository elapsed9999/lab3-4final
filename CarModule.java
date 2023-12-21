import java.util.ArrayList;



public class CarModule {
    // member fields:
   


    // The delay (ms) corresponds to 20 updates a sec (hz)
    // The timer is started with a listener (see below) that executes the statements
    // each step between delays.

    // The frame that represents this instance View of the MVC pattern
    // A list of cars, modify if needed
    static ArrayList<Car> cars = new ArrayList<>();
    static ArrayList<Scania> scania = new ArrayList<>();
    
    //methods:

    public static ArrayList<Car> getCars() {
        return cars;
    }

    public static ArrayList<Scania> getScania() {
        return scania;
    }
    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */

    
}