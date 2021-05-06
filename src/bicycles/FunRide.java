package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    private final int maxPerRide;
    List<String> list = new ArrayList<String>();

    public FunRide(int maxPerRide){
        this.maxPerRide=maxPerRide;
    }

    public void takeRide(BicycleType bike){
        String bicycle = bike.getBikeType();

        if(this.list.size()>=maxPerRide){
            System.out.println("Maximum rides have been reached");
        }else{
            this.list.add(bicycle);
        }
    }

    public int getEnteredCount() {
        return list.size();
    }

    public int getCountForType(BicycleType bike){
        int count = 0;
        String bicycle = bike.getBikeType();

        for(int i = 0; i < list.size(); i++){
         if(list.get(i)==bicycle) {
             count++;
         }
        }
        return count;
    }
}
