package bicycles;

public enum BicycleType {

    RoadBike ("RoadBike",11,-4),
    MountainBike ("MountainBike",5,-3),
    Tandem ("Tandem",12,-7);

    private final String bikeType;
    private final int accelerate;
    private final int brake;

    BicycleType(String bikeType,int accelerate, int brake){
        this.bikeType=bikeType;
        this.accelerate=accelerate;
        this.brake=brake;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public int getBrake() {
        return brake;
    }

    public String getBikeType() {
        return bikeType;
    }
}