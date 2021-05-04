package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTests {
    @Test
    public void shouldTakeMountainRide() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(14, bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeRoadRide() {

        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(36, bikeRide.currentSpeed());
    }

    @Test
    public void shouldTakeTandemRide() {

        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(34, bikeRide.currentSpeed());
    }
}
