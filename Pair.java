// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/
public class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public K getKey(){
        return key;
    }
    
    public V getValue(){
        return value;
    }
    
    public void setValue(V value){
        this.value = value;
    }
}
//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
