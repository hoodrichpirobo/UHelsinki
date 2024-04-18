/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cux27
 */
public class PersonV{
    
    private String name;
    private String location;
    
    public Person(String name, String location){
        this.name = name;
        this.location = location;
    }
    
    public String toString(){
        return this.name + "\n" + "  " + this.location;
    }
}
