
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        while(!(name.equals(""))){
            items.add(new Item(name));
            System.out.print("Name: ");
            name = scanner.nextLine();
        }
        
        for(Item names : items){
            System.out.println(names);
        }

    }
}
