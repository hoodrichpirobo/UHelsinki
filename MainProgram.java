
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        /*
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        */
        
        Statistics stats = new Statistics();
        Statistics evenstats = new Statistics();
        Statistics oddstats = new Statistics();
        System.out.println("Enter numbers: ");
        int input = Integer.valueOf(scanner.nextLine());
        while(input!=-1){
            stats.addNumber(input);
            if(input%2==0){
                evenstats.addNumber(input);
            } else {
                oddstats.addNumber(input);
            }
            input = Integer.valueOf(scanner.nextLine());
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenstats.sum());
        System.out.println("Sum of odd numbers: " + oddstats.sum());

    }
}
