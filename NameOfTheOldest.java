
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name ="";
        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String[] pieces = str.split(",");
            int age = Integer.valueOf(pieces[1]);
            if(age > oldest){
                oldest = age;
                name = pieces[0];
            }            
            str = scanner.nextLine();
        }
        
        System.out.println("Name of the oldest: " + name);

    }
}
