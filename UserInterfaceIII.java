import java.util.*;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scan;
    
    public UserInterface(JokeManager manager, Scanner scan){
        this.manager = manager;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scan.nextLine();
            
            if(command.equals("X")){
                break;
            }
            
            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                manager.addJoke(joke);
            } else if(command.equals("2")){
                System.out.println("Drawing a joke.");
                
                System.out.println(manager.drawJoke());
            }else if(command.equals("3")){
                System.out.println("Printing the jokes.");
                
                manager.printJokes();
            }
            
        }
    }
    
}
