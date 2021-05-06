package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldGetCountForTandemBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);

        assertEquals(1,funRide.getCountForType(BicycleType.Tandem));
    }

    @Test
    public void shouldGetCountForRoadBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);

        assertEquals(2,funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void shouldGetCountForMountainBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);

        assertEquals(2,funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    public void shouldGetCountForAllBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.MountainBike);
        funRide.takeRide(BicycleType.RoadBike);
        funRide.takeRide(BicycleType.Tandem);
        funRide.takeRide(BicycleType.RoadBike);

        assertEquals(5,funRide.getEnteredCount());
    }
}
