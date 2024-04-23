import java.util.*;
import java.util.stream.*;

public class PrintingUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> parts = new ArrayList<>();
        while(true){
            String line = in.nextLine();
            if(line.equals("")){
                break;
            }
            parts.add(line);
        }
        parts.stream()
                .forEach(phrase -> System.out.println(phrase));
    }
}
