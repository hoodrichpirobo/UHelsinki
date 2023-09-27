
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.valueOf(scanner.nextLine());
        for (int end = 100; end >= start; start++) {
            System.out.println(start);
        }
    }
}
