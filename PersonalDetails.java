
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0, length = 0;
        String longestname = "";
        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String[] pieces = str.split(",");
            int longname = pieces[0].length();
            if (longname > length){
                length = longname;
                longestname = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            count++;
            str = scanner.nextLine();
        }
        
        System.out.println("Longest name: " + longestname);
        System.out.println("Average of the birth years: " + (1.0*sum/count));

    }
}
