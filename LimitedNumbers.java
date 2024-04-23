import java.util.*;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while(true){
            int n = in.nextInt();
            if(n<0){
                break;
            }
            input.add(n);
        }
        input.stream()
                .filter(s -> 1<=s && s<=5)
                .forEach(num -> System.out.println(num));
    }
}
