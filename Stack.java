import java.util.*;

public class Stack {
    
    private ArrayList<String> values;
    
    public Stack(){
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.values.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public void add(String value){
        this.values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    
    public String take(){
        String taken = this.values.get(this.values.size()-1);
        this.values.remove(this.values.size()-1);
        return taken;
    }
    
}
