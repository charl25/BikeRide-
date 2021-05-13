package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    Bicycle mountainBike = new MountainBike();
    Bicycle roadBike = new RoadBike();
    Bicycle tandem = new Tandem();

    @Test
    public void shouldGetCountForTandemBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(1,funRide.getCountForType(BicycleType.Tandem));
    }

    @Test
    public void shouldGetCountForRoadBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(2,funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void shouldGetCountForMountainBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(2,funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    public void shouldGetCountForAllBikesOnFunRide(){
        FunRide funRide = new FunRide(5);

        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(5,funRide.getEnteredCount());
    }
}
