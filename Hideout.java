// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Hideout<T> {
    private T value;
    
    public void putIntoHideout(T toHide){
        this.value = toHide;
    }
    
    public T takeFromHideout(){
        return this.value;
    }
    
    public boolean isInHideout(){
        if(this.value==null) return false;
        return true;
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
