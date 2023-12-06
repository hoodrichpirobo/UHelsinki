import java.nio.file.*;
import java.util.*;

public class IsItInTheFile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scan.nextLine();
        System.out.println("Search for: ");
        String searchedFor = scan.nextLine();
        
        int lines = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                if(!line.contains(searchedFor)){
                    continue;
                }
                
                lines++;
                break;
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        if (lines == 0){
            System.out.println("Not found.");
        }else {
            System.out.println("Found!");
        }
    }
}
