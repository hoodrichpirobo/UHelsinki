
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String[] pieces = str.split(" ");
            System.out.println(pieces[0]);
            str = scanner.nextLine();
        }

    }
}
