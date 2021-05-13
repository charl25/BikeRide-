package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private final int maxPerRide;
    List<Bicycle> list = new ArrayList<Bicycle>();

    public FunRide(int maxPerRide){
        this.maxPerRide=maxPerRide;
    }

    public void accept(Bicycle bike){
       //String bicycle = bike.getBikeType();

        if(this.list.size()>=maxPerRide){
            System.out.println("Maximum rides have been reached");
        }else{
            this.list.add(bike);
        }
    }

    public int getEnteredCount() {
        return list.size();
    }

    public int getCountForType(BicycleType bike){
        int count = 0;
        //String bicycle = bike.getBikeType();

        for(Bicycle ride : list){
         if(bike.equals(ride.getBicycleType())){
             count++;
         }
        }
        return count;
    }
}
