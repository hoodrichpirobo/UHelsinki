import java.util.*;

public class Hold {
    
    private int MaxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int MaxWeight){
        this.MaxWeight = MaxWeight;
        suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.getTotalWeight() + suitcase.totalWeight() <= this.MaxWeight){
            suitcases.add(suitcase);
        }
    }
    
    public int getTotalWeight(){
        int totalweight = 0;
        
        for(Suitcase each : suitcases){
            totalweight += each.totalWeight();
        }
        
        return totalweight;
    }
    
    public String toString(){
        int quantity = 0;
        
        for(Suitcase each : suitcases){
            quantity++;
        }
        
        if(quantity == 0){
            return "no suitcases (" + this.getTotalWeight() + " kg)";
        }
        
        if(quantity == 1){
            return quantity + " suitcase (" + this.getTotalWeight() + " kg)"; 
        }
        
        return quantity + " suitcases (" + this.getTotalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Suitcase each : suitcases){
            each.printItems();
        }
    }
    
}
