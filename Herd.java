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

public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String str = "";
        for(Movable each : this.herd){
            str += each.toString() + "\n";
        }
        return str;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable each : this.herd){
            each.move(dx, dy);
        }
    }
}
