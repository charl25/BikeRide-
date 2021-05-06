package bicycles;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    private final BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed=-brakeSpeed;
        this.bicycleType=bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
    public BicycleType getBicycleType() {
        return bicycleType;
    }
}

//package bicycles;
//
//public class BicycleSpecification {
//
//    private final BicycleType bicycleType;
//
//
//    public BicycleSpecification(BicycleType bicycleType) {
//        this.bicycleType=bicycleType;
//    }
//
//    public int getAccelerationSpeed(){
//        return bicycleType.getAccelerate();
//    }
//    public int getBrakeSpeed(){
//        return bicycleType.getBrake();
//    }
//
//}

