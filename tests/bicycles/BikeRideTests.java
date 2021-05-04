package bicycles;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTests {
    @Test
    public void shouldTakeRide() {

        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(14, bikeRide.currentSpeed());
    }
}
