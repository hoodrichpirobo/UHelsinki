
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        
        System.out.println("Identifier? (empty will stop)");
        String ID = scanner.nextLine();
        
        while(!(ID.isEmpty())){
            System.out.println("Name? (Empty will stop)");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            Archive item = new Archive(ID, name);
            if(!(archives.contains(item))){
                archives.add(item);
            }
            
            System.out.println("Identifier? (empty will stop)");
            ID = scanner.nextLine();            
        }
        
        System.out.println("==Items==");
        for(Archive each: archives){
            System.out.println(each);
        }

    }
}
