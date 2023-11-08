

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
      
        int i = 0;
        
        for (int j = 0; j < array.length; j++){
            if (array[j] == searching ){
                System.out.println(searching + " is at index " + j + ".");
                i++;
                break;
            }
        }
        
        if (i == 0){
            System.out.println(searching + " was not found.");
        }
        
    }

}
