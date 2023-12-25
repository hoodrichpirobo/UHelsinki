import java.util.*;

public class JokeManager {
    
    private ArrayList<String> manager;
    
    public JokeManager(){
        this.manager = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.manager.add(joke);
    }
    
    public String drawJoke(){
        if(manager.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random random = new Random();
        
        return manager.get(random.nextInt(manager.size()));
    }
    
    public void printJokes(){
        for(String each : manager){
            System.out.println(each);
        }
    }
    
}
