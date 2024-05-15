package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;    
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class MultipleViews extends Application {
    @Override
    public void start(Stage window){
        BorderPane firstView = new BorderPane();
        Label text = new Label("First View!");
        Button firstButton = new Button("To the second view!");
        firstView.setTop(text);
        firstView.setCenter(firstButton);
        Scene first = new Scene(firstView);
        
        Button thirdButton = new Button("To the third view!");
        VBox secondView = new VBox(thirdButton);
        secondView.getChildren().add(new Label("Second view!"));
        Scene second = new Scene(secondView);
        
        GridPane thirdView = new GridPane();
        Label moreText = new Label("Third view!");
        Button firstButtonAgain = new Button("To the first view!");
        thirdView.add(moreText, 0, 0);
        thirdView.add(firstButtonAgain, 1, 1);
        Scene third = new Scene(thirdView);
        
        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(third);
        });
        
        firstButtonAgain.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
