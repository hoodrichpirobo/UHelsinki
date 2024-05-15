package buttonandtextfield;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ButtonAndTextFieldApplication extends Application {
    

    @Override
    public void start(Stage window){
        Button buttonComponent = new Button("Click");
        TextField textComponent = new TextField("Some text");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textComponent);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
