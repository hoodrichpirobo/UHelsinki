package smiley;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

public class SmileyApplication extends Application {
    @Override
    public void start(Stage window){
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, paintingCanvas.getWidth(), paintingCanvas.getHeight());
        
        painter.setFill(Color.BLACK);
        
        painter.fillRect(200, 100, 50, 50);
        painter.fillRect(400, 100, 50, 50);
        
        painter.fillRect(150, 300, 50, 50);
        painter.fillRect(200, 350, 250, 50);
        painter.fillRect(450, 300, 50, 50);
        
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        
        Scene view = new Scene(paintingLayout);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
