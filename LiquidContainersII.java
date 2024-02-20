
import java.util.Scanner;

public class LiquidContainersII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("First: ");            
            System.out.println(first + "/100");
            System.out.print("Second: ");
            System.out.println(second+"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);
            
            if(command.equals("add") && quantity > 0){
                first += quantity;
                if(first>100){
                    first = 100;
                }
            }
            
            if(command.equals("move") && quantity >0){
                int diff = quantity - first;
                if(diff >= 0){
                    second += first;
                    first = diff;
                }else if(diff < 0){
                    second += quantity;
                    first = (-1)*diff;
                }
                
                if (second>100){
                    second = 100;
                }
            }
            
            if(command.equals("remove") && quantity > 0){
                int diff = quantity - second;
                if(diff > 0){
                    second = 0;
                }else{
                    second = -1*diff;
                }
                
                if(second<0){
                    second=0;
                }
            }
        }
    }

}
