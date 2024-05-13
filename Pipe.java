// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Pipe<T> {
    private List<T> values;
    
    public Pipe(){
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.values.add(value);
    }
    
    public T takeFromPipe(){
        if(!this.isInPipe()) return null;
        T first = this.values.get(0);
        this.values.remove(0);
        return first;
    }
    
    public boolean isInPipe(){
        return !this.values.isEmpty();
    }
}
//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
