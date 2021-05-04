package bicycles;

public abstract class BicycleBase implements Bicycle {

    protected int speed;

    protected void changeSpeed(int change){
        speed +=change;
    }

    public int currentSpeed(){
        if (speed < 0 ){
            return 0;
        }
        else {
            return speed;
        }
    }

    public void stop(){
        speed=0;
    }

}
