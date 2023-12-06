
import java.nio.file.*;
import java.util.*;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int i = 0;
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            
            while(fileReader.hasNextLine()){
                int number = fileReader.nextInt();
                if(number >=lowerBound && number <=upperBound){
                    i++;
                }
            }
            
        }catch(Exception e){}
        
        System.out.println("Numbers: " + i);
    }

}
