package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideTwo implements BikeRide  {

    public final Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle){
        this.bicycle=bicycle;
    }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
    }

    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
