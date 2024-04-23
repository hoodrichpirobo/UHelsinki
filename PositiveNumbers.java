import java.util.*;
import java.util.stream.*;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> positives = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positives;
    }

}
