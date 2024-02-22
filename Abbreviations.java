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

public class Abbreviations {
    private HashMap<String, String> map;
    
    public Abbreviations(){
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return map.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        if(!map.containsKey(abbreviation)){
            return null;
        }
        
        return map.get(abbreviation);
    }
}
