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

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.getWeight() + item.getWeight() > this.capacity){
            return;
        }
        this.items.add(item);
    }
    
    @Override
    public boolean isInBox(Item item){
        for(Item each : items){
            if (each.equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public int getWeight(){
        int weight = 0;
        for(Item each : items){
            weight += each.getWeight();
        }
        return weight;
    }
    
}
