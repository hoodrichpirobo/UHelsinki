import java.util.*;

public class Gift {
    
    private String name;
    private int weight;
    
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return name + " (" + this.weight + "kg)";
    }
    
}
