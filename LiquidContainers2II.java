import java.util.Scanner;

public class LiquidContainers2II {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] partsOfInput = input.split("\\s+");
            String command = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
            if(command.equals("add")){
                first.add(amount);
            }
            if(command.equals("remove")){
                second.remove(amount);
            }
            if(command.equals("move")){
                if(amount>first.contains()){
                    amount = first.contains();
                }                
                first.remove(amount);
                second.add(amount);
            }
        }
    }

}
