import java.util.*;

public class TodoList {
    
    private ArrayList<String> todo;
    
    public TodoList(){
        this.todo = new ArrayList<>();
    }
    
    public void add(String task){
        this.todo.add(task);
    }
    
    public void print(){
        int i = 1;
        
        for(String each : this.todo){
            System.out.println(i + ": " + each);
            i++;
        }
    }
    
    public void remove(int number){
        this.todo.remove(number-1);
    }
    
    
}
