/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
import java.util.*;

public class BoxII implements Packable {
    private ArrayList<Packable> items;
    private double maxCapacity;
    
    public BoxII(double maxCapacity){
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable item){
        if(this.weight() + item.weight() <= this.maxCapacity){
            this.items.add(item);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(Packable each : items){
            weight += each.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
