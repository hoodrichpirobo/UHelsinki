/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class Multiplier {
    
    private int num;
    
    public Multiplier(int number){
        this.num = number;
    }
    
    public int multiply(int number){
        return number *= this.num;
    }
    
}
