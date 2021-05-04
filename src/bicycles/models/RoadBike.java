package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {
    private int speed;
    @Override
    public void accelerate() {
        this.speed += 11;
    }
    @Override
    public void brake() {
        this.speed -= 4;
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
        this.speed=0;
    }
}
