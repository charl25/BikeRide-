package bicycles;

public enum BicycleType {

    RoadBike (11,-4),
    MountainBike (5,-3),
    Tandem (12,-7);

    private final int accelerate;
    private final int brake;

    BicycleType(int accelerate, int brake){
        this.accelerate=accelerate;
        this.brake=brake;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public int getBrake() {
        return brake;
    }
}