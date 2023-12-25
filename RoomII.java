import java.util.*;

public class Room {
    
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        if(this.isEmpty()){
            return null;
        }
        
        return this.persons;
    }
    
    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        
        Person ShortKing = this.persons.get(0);
        
        for(Person each : this.persons){
            if(ShortKing.getHeight()>each.getHeight()){
                ShortKing = each;
            }
        }
        
        return ShortKing;
    }
    
    public Person take(){
        Person OompaLoompa = this.shortest();
        this.persons.remove(this.shortest());
        return OompaLoompa;
    }
    
}
