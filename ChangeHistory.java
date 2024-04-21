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
public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    public double maxValue(){
        if(this.history.isEmpty()) return 0;
        double max = this.history.get(0);
        for(double each : this.history){
            if(max < each){
                max = each;
            }
        }
        return max;
    }
    public double minValue(){
        if(this.history.isEmpty()) return 0;
        double min = this.history.get(0);
        for(double each : this.history){
            if(min > each){
                min = each;
            }
        }
        return min;
    }
    public double average(){
        if(this.history.isEmpty()) return 0;
        double sum = 0;
        for(double each : this.history){
            sum += each;
        }
        return sum/this.history.size();
    }
    @Override
    public String toString(){
        return this.history.toString();
    }
}
