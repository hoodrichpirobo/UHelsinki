
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            } else {
                count += 1;
                sum += number;
            }
        }
        
        if (count > 0){
            System.out.println("Average of the numbers: " + 1.0*sum/count);
        }
    }
}
