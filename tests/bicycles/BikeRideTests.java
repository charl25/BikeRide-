package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTests {
    @Test
    public void shouldTakeRide() {

        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        assertEquals(14, bikeRide.currentSpeed());
    }
}
