import java.util.*;

public class Container {
    
    private int amountin;
    
    public Container(){
        this.amountin = 0;
    }
    
    public int contains(){
        return this.amountin;
    }
    
    public void add(int amount){
        if(amount < 0){
            amount = 0;
        }
        
        if(this.amountin + amount > 100){
            amount = 100 - this.amountin;
        }
        
        this.amountin += amount;
    }
    
    public void remove(int amount){
        if(amount < 0){
            amount = 0;
        }
        
        if(this.amountin - amount < 0){
            amount = this.amountin;
        }
        
        this.amountin -= amount;
    }
    
    public String toString(){
        return this.amountin +"/100";
    }
    
}
