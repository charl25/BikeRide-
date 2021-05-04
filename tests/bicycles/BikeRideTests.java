package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;

import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideTwo;
import bicycles.rides.BikeRideThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTests {
    //Mountain Bike
    @Test
    public void shouldTakeMountainRideOne() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(14, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeMountainRideTwo() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(24, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeMountainRideThree() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(11, bicycle.currentSpeed());
    }

    //Road Bike
    @Test
    public void shouldTakeRoadRideOne() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(36, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeRoadRideTwo() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(58, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeRoadRideThree() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(32, bicycle.currentSpeed());
    }

    //Tandem Bike
    @Test
    public void shouldTakeTandemRideOne() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(34, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemRideTwo() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(58, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemRideThree() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(27, bicycle.currentSpeed());
    }
}
