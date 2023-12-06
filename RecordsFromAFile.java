
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            
            while(fileReader.hasNextLine()){
                String[] parts = fileReader.nextLine().split(",");
                String name = parts[0];
                String age = (Integer.valueOf(parts[1])!=1) ? parts[1] + " years" : parts[1] + " year";
                System.out.println(name + ", age: " + age);
            }
            
        }catch (Exception e){}

    }
}
