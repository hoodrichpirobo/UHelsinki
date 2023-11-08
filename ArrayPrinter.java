
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        
        String res = "" + array[0];
        
        for(int i = 1; i < array.length; i++){
            res += ", " + array[i];
        }
        
        System.out.print(res);
        
    }
}
