/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public abstract class Animal implements NoiseCapable {
    private String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    public void eat(){
        System.out.println(this.getName() + " eats");
    }
    
    public void sleep(){
        System.out.println(this.getName() + " sleeps");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void makeNoise(){
        
    }
}
