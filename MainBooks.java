import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title = scan.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = scan.nextInt();
            System.out.println("Publication year: ");
            int years = scan.nextInt();
            
            books.add(new Book(title, pages, years));
            
            scan.nextLine();
            
        }
        
        System.out.println("What information will be printed? ");
        String info = scan.nextLine();
        
        for (Book each : books){
            if (info.equals("everything")){
                System.out.println(each.toString());
            } else if (info.equals("name")){
                System.out.println(each.getTitle());
            }
        }
        
    }
}
