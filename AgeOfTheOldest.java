
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String[] pieces = str.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest){
                oldest = age;
            }
            
            str = scanner.nextLine();
        }

        System.out.println("Age of the oldest: " + oldest);
                
    }
}
