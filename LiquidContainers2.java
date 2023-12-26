
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container a = new Container(), b = new Container();


        while (true) {
            System.out.println("First: " + a);
            System.out.println("Second: " + b );

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }else{
                String[] parts = input.split("\\s+");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if(command.equals("add")){
                    a.add(amount);
                }

                if(command.equals("move")){
                    if(a.contains()<amount){
                        b.add(a.contains());
                        a.remove(a.contains());
                    }else{
                        b.add(amount);
                        a.remove(amount);
                    }
                }

                if(command.equals("remove")){
                    b.remove(amount);
                }
            
            }
        }
    }

}
