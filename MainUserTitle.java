package title;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import java.util.*;

public class Main {
    static Scanner in;
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        String title = in.nextLine();
        
        Application.launch(UserTitle.class,
                "--userTitle=" + title);
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
