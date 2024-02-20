
import java.util.Scanner;

public class AverageOfPositiveNumbersII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while(true){
            int element = scanner.nextInt();
            if(element == 0){
                break;
            }
            if(element < 0){
                continue;
            }
            count++;
            sum += element;
        }
        
        if(count==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(1.0*sum/count);
        }
    }
}
