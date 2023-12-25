import java.util.*;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int MaxWeight;
    
    public Suitcase(int MaxWeight){
        this.items = new ArrayList<>();
        this.MaxWeight = MaxWeight;
    }
    
    public void addItem(Item item){
        if(this.totalWeight()+item.getWeight()<=this.MaxWeight){
            this.items.add(item);
        }
    }
    
    public int totalWeight(){
        if(this.items.isEmpty()){
            return 0;
        }
        
        int TotalWeight = 0;
        
        for(Item each : this.items){
            TotalWeight += each.getWeight();
        }
        
        return TotalWeight;
    }
    
    public String toString(){
        int quantity = 0;
        for(Item each : this.items){
            quantity++;
        }
        
        if (quantity == 0){
            return "no items (" + this.totalWeight() + " kg)";
        }
        if (quantity == 1){
            return quantity + " item (" + this.totalWeight() + " kg)";
        }
        return quantity + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Item each : this.items){
            System.out.println(each.getName() + " (" + each.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item GordiBueno = this.items.get(0);
        
        for(Item each : this.items){
            if(GordiBueno.getWeight() < each.getWeight()){
                GordiBueno = each;
            }
        }
        
        return GordiBueno;
    }
}
