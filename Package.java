import java.util.*;

public class Package {
    
    private ArrayList<Gift> gifts ;
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        int TotalWeight = 0;
        
        for(Gift each : gifts){
            TotalWeight += each.getWeight();
        }
        
        return TotalWeight;
    }
    
}
