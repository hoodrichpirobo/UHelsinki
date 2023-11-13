
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        while(!(str.equals(""))){
            String[] pieces = str.split(" ");
            for(String piece : pieces){
                if(piece.contains("av")){
                    System.out.println(piece);
                }
            }
            str = scanner.nextLine();
        }

    }
}
