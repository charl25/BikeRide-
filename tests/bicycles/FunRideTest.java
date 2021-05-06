package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void funRideOne(){
        FunRide funRide = new FunRide(2);

        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);

        assertEquals(2,funRide.getCountForType(BicycleType.Tandem));
    }

    @Test
    public void funRideTwo(){
        FunRide funRide = new FunRide(2);

        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);

        assertEquals(0,funRide.getCountForType(BicycleType.RoadBike));
    }
}
