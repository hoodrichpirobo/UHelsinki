
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        
        for (int i= 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        
        int j = size - 1;
        
        for(int i= 1; i <= size; i++){
            printSpaces(j);
            printStars(i);
            j--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int j = height - 1;
        int k = 0;
        int n = 1;
        
        for (int i = 1; i <= height; i++){
            printSpaces(j);
            printStars(i+k);
            k++;
            j--;
        }
        
        while(n<=2){
            printSpaces(height-2);
            printStars(3);
            n++;
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printStars(1);
        System.out.println("---");
        printSpaces(1);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
