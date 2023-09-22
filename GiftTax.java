
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift? ");
        int number = Integer.valueOf(scan.nextLine());
        if (number >= 5000 && number < 25000) {
            System.out.println("Tax: " + (100 + (number-5000)*0.08));
        }else if (number >= 25000 && number < 55000){
            System.out.println("Tax: " + (1700 + (number - 25000)*0.1));
        }else if (number >= 55000 && number < 200000) {
            System.out.println("Tax: " + (4700+(number - 55000)*0.12));
        }else if (number >= 200000 && number < 1000000) {
            System.out.println("Tax: " + (22100 + (number -200000)*0.15));
        }else if (number >= 1000000) {
            System.out.println("Tax: " + (142100 + (number - 1000000)*0.17));
        }else {
            System.out.println("No tax!");
        }
    }
}
