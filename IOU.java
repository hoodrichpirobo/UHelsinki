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
public class IOU {
    
    private HashMap<String, Double> debts;
    
    public IOU(){
        this.debts = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.debts.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double thisMuch = this.debts.getOrDefault(toWhom, 0.0);
        return thisMuch;
    }
}
