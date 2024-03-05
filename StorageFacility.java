import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> containers;
    
    public StorageFacility(){
        this.containers = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.containers.putIfAbsent(unit, new ArrayList<>());
        
        this.containers.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.containers.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        this.containers.get(storageUnit).remove(item);
        if(this.containers.get(storageUnit).isEmpty()){
            this.containers.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> nonEmpty = new ArrayList<>();
        for(String keys : this.containers.keySet()){
            if(this.containers.get(keys).isEmpty()){
                continue;
            }
            nonEmpty.add(keys);
        }
        return nonEmpty;
    }
}
