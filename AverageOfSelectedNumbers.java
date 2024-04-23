import java.util.*;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> input = new ArrayList<>();
        
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")){
                break;
            }
            input.add(line);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String decision = scanner.nextLine();
        
        if(decision.equals("p")){
            double average = input.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }else if(decision.equals("n")){
            double average = input.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
    }
}
