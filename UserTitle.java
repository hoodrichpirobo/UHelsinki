package title;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.stage.*;

public class UserTitle extends Application {
    @Override
    public void start(Stage window){
        Parameters params = getParameters();
        String userTitle = params.getNamed().get("userTitle");
        
        window.setTitle(userTitle);
        window.show();
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
