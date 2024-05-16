package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Dictionary {
    private List<String> words;
    private Map<String, String> translations;
    
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        add("apple", "manzana");
    }
    
    public String get(String word){
        return this.translations.get(word);
    }
    
    public void add(String word, String translation){
        if(!this.translations.containsKey(word)){
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
