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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!this.registry.containsKey(licensePlate)){
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!this.registry.containsKey(licensePlate)){
            return false;
        }
        
        this.registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlates : this.registry.keySet()){
            System.out.println(licensePlates);
        }
    }
    
    public void printOwners(){
        ArrayList<String> rememberingOwners = new ArrayList<>();
        for(LicensePlate licensePlates : this.registry.keySet()){
            String name = this.registry.get(licensePlates);
            if(!rememberingOwners.contains(name)){
                rememberingOwners.add(name);
                System.out.println(name);
            }
        }
    }
}
