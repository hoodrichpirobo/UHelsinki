package dictionary;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;
import java.nio.file.*;
import java.io.*;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private Map<String, String> savedDictionary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
        this.savedDictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this();
        this.file = file;
    }
    
    public boolean load(){
        try(Scanner in = new Scanner(Paths.get(this.file))){
            while(in.hasNext()){
                String[] parts = in.nextLine().split(":");
                this.add(parts[0], parts[1]);
            }
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
            return false;
        }
        return true;
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
        this.savedDictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        return this.dictionary.get(word);
    }
    
    public void delete(String word){
        String translation = this.dictionary.get(word);
        this.dictionary.remove(translation);
        this.dictionary.remove(word);
        this.savedDictionary.remove(word);
        this.savedDictionary.remove(translation);
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(this.file)){
            for(String each : this.savedDictionary.keySet()){
                writer.println(each + ":" + this.dictionary.get(each));
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
