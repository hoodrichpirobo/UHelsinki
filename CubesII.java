
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        while(!(str.equals("end"))){
            int cube = Integer.valueOf(str);
            System.out.println(cube*cube*cube);
            str = scanner.nextLine();
        }

    }
}
