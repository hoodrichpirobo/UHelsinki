package buttonandlabel;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.application.*;

public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
    
    @Override
    public void start(Stage window){
        Button buttonComponent = new Button("Fran");
        Label textComponent = new Label("De La Guía");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(buttonComponent);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
