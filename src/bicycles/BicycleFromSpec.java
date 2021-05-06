package bicycles;

public class BicycleFromSpec extends BicycleBase{

    private final BicycleSpecification bikeSpec;

    public BicycleFromSpec(BicycleSpecification bikeSpec){
        this.bikeSpec=bikeSpec;
    }

    @Override
    public void accelerate() {
        this.changeSpeed(this.bikeSpec.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        this.changeSpeed(this.bikeSpec.getBrakeSpeed());
    }


}
