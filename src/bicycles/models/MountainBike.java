package bicycles.models;

import bicycles.Bicycle;

public class MountainBike implements Bicycle {
    private int speed;
    @Override
    public void accelerate() {
        this.speed += 5;
    }
    @Override
    public void brake() {
        this.speed -= 3;
    }
    @Override
    public int currentSpeed(){
        if (speed < 0 ){
            return 0;
        }
        else {
            return speed;
        }
    }
    @Override
    public void stop(){
        speed=0;
    }
}
