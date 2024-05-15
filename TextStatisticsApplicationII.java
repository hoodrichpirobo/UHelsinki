package textstatistics;

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
import java.util.*;

public class TextStatisticsApplicationII extends Application {
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        TextArea text = new TextArea();
        HBox textComponents = new HBox();

        textComponents.setSpacing(10);
        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words : 0");
        Label longestTrack = new Label("The longest word is: ");

        textComponents.getChildren().addAll(letterCount, wordCount, longestTrack);
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            letterCount.setText("Letters: " + characters);
            wordCount.setText("Words: " + words);
            longestTrack.setText("The longest word is: " + longest);
        });
        
        layout.setBottom(textComponents);
        layout.setCenter(text);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
