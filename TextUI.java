import java.util.*;

public class TextUI {
    
    private Scanner scan;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scan = scan;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Command: ");
        String command = scan.nextLine();
        
        while(!(command.equals("end"))){
            
            if(command.equals("add")){
                System.out.println("Word: ");
                String word = scan.nextLine();
                System.out.println("Translation: ");
                String translation = scan.nextLine();
                
                this.dictionary.add(word, translation);
                System.out.println("Command: ");
                command = scan.nextLine();                
                continue;
            }
            
            if(command.equals("search")){
                System.out.println("To be translated: ");
                String word = scan.nextLine();
                
                String translation = this.dictionary.translate(word);
                
                if(translation == null){
                    System.out.println("Word " + word + " was not found");
                } else{
                    System.out.println("Translation: " + translation);                    
                }
                
                System.out.println("Command: ");
                command = scan.nextLine();                
                continue;
            }
            
            System.out.println("Unknown command");
            System.out.println("Command: ");
            command = scan.nextLine();
            
        }
        
        System.out.println("Bye bye!");
    }
    
}
