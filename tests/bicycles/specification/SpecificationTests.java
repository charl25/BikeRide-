package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTests {
    //Mountain Bike
    @Test
    public void shouldTakeMountainRideOne() {
        BicycleSpecification mBikeSpec= new BicycleSpecification(5,3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mBikeSpec);

        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(14, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeMountainRideTwo() {
        BicycleSpecification mBikeSpec= new BicycleSpecification(5,3,BicycleType.MountainBike) ;
        Bicycle bicycle = new BicycleFromSpec(mBikeSpec);

        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(24, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeMountainRideThree() {
        BicycleSpecification mBikeSpec= new BicycleSpecification(5,3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mBikeSpec);

        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(11, bicycle.currentSpeed());
    }

    //Road Bike
    @Test
    public void shouldTakeRoadRideOne() {
        BicycleSpecification rBikeSpec= new BicycleSpecification(11,4,BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(rBikeSpec);

        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(36, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeRoadRideTwo() {
        BicycleSpecification rBikeSpec= new BicycleSpecification(11,4,BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(rBikeSpec);

        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(58, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeRoadRideThree() {
        BicycleSpecification rBikeSpec= new BicycleSpecification(11,4,BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(rBikeSpec);

        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(32, bicycle.currentSpeed());
    }

    //Tandem Bike
    @Test
    public void shouldTakeTandemRideOne() {
        BicycleSpecification tBikeSpec= new BicycleSpecification(12,7,BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tBikeSpec);

        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(34, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemRideTwo() {
        BicycleSpecification tBikeSpec= new BicycleSpecification(12,7,BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tBikeSpec);

        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(58, bicycle.currentSpeed());
    }
    @Test
    public void shouldTakeTandemRideThree() {
        BicycleSpecification tBikeSpec= new BicycleSpecification(12,7,BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tBikeSpec);

        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride(bicycle);
        assertEquals(27, bicycle.currentSpeed());
    }
}
