// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.Scanner;

public class SumTheseForMe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));        
        
    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        if(fromWhere < 0){
            fromWhere = 0;
        }
        
        if(toWhere > array.length){
            toWhere = array.length;
        }
        
        int sum = 0;
        for(int i = fromWhere; i < toWhere; i++){
            if(smallest <= array[i] && array[i] <= largest){
                sum += array[i];
            }
        }
        
        return sum;
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
