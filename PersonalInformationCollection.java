
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String name = scanner.nextLine();
        while(!(name.equals(""))){
            System.out.println("Last name: ");
            String lastname = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            System.out.println("First name: ");
            infoCollection.add(new PersonalInformation(name, lastname, id));
            name = scanner.nextLine();
        }
        
        for(PersonalInformation details: infoCollection){
            System.out.println(details.getFirstName() + " " + details.getLastName());
        }

    }
}
