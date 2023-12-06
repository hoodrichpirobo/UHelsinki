
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            
            while(fileReader.hasNextLine()){
                String[] parts = fileReader.nextLine().split(",");
                Person each = new Person(parts[0],Integer.valueOf(parts[1]));
                persons.add(each);
            }
            
        }catch(Exception e){}
        
        return persons;

    }
}
