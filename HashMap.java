// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/
import java.util.*;

public class HashMap<K, V> {
    private ArrayList<ArrayList<Pair<K,V>>> values;
    private int firstFreeIndex;
    
    public HashMap(){
        this.values = new ArrayList<>();
        this.firstFreeIndex = 0;
    }
    
    public V get(K key){
        int hashValue = Math.abs(key.hashCode() % this.values.size());
        if(this.values.get(hashValue) == null){
            return null;
        }
        
        ArrayList<Pair<K, V>> valuesAtIndex = this.values.get(hashValue);
        
        for(int i = 0; i < valuesAtIndex.size(); i++){
            if(valuesAtIndex.get(i).getKey().equals(key)){
                return valuesAtIndex.get(i).getValue();
            }
        }
        
        return null;
    }
    
    public void add(K key, V value){
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if(index < 0){
            valuesAtIndex.add(new Pair<>(key,value));
            this.firstFreeIndex++;
        }else{
            valuesAtIndex.get(index).setValue(value);
        }
    }
    
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key){
        int hashValue = Math.abs(key.hashCode() % values.size());
        if(values.get(hashValue) == null){
            values.set(hashValue, new ArrayList<>());
        }
        
        return values.get(hashValue);
    }
    
    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key){
        for(int i = 0; i < myList.size(); i++){
            if(myList.get(i).getKey().equals(key)){
                return i;
            }
        }
        
        return -1;
    }
    
    private void grow(){
       ArrayList<ArrayList<Pair<K, V>>> newValues = new ArrayList<>();
       
       for(int i = 0; i < this.values.size(); i++){
           
       }
       
       this.values = newValues;
    }
    
    private void copy(ArrayList<ArrayList<Pair<K, V>>> newArray, int fromIdx){
        for(int i = 0; i < this.values.get(fromIdx).size(); i++){
            Pair<K, V> value = this.values.get(fromIdx).get(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.size());
            if(newArray.get(hashValue) == null){
                newArray.set(hashValue, new ArrayList<>());
            }
            
            newArray.get(hashValue).add(value);
        }
    }
}
//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
