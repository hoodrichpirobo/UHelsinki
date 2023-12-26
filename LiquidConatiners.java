import java.util.*;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;


        while (true) {
            System.out.println("First: " + a + "/100");
            System.out.println("Second: " + b + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }else{
                String[] parts = input.split("\\s+");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if(command.equals("add")){
                    if(a+amount<=100 && amount > 0){
                        a +=amount;
                    } else{
                        a = 100;
                    }
                }

                if(command.equals("move")){
                    if(amount>a){
                        if(b+a<100){
                            b += a;
                        }else{
                            b = 100;
                        }
                        a = 0;
                    }else{
                        if(b+amount<100 && amount >= 0){
                            b += amount;
                            a -= amount;
                        }else{
                            b = 100;
                            a = 0;
                        }
                    }
                }

                if(command.equals("remove")){
                    if(amount>b){
                        b = 0;
                    }else if (amount >= 0 && amount <= b){
                        b -= amount;
                    }
                }
            
            }
        }
    }

}
