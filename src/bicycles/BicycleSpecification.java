package bicycles;

public class BicycleSpecification {

    private final BicycleType bicycleType;


    public BicycleSpecification(BicycleType bicycleType) {
        this.bicycleType=bicycleType;
    }

    public int getAccelerationSpeed(){
        return bicycleType.getAccelerate();
    }
    public int getBrakeSpeed(){
        return bicycleType.getBrake();
    }

}

