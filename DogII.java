/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class Dog extends Animal {
    public Dog(){
        super("Dog");
    }
    
    public Dog(String name){
        super(name);
    }
    
    public void bark(){
        System.out.println(super.getName() + " barks");
    }
    
    @Override
    public void makeNoise(){
        this.bark();
    }
}
