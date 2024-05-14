// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int n = in.nextInt();
        Random random = new Random();
        
        for(int i = 0; i < n; i++){
            System.out.println(random.nextInt(11));
        }
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
