package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class GreeterApplication extends Application {
    @Override
    public void start(Stage window) throws Exception{
        Label instructionText = new Label("Enter your name and start.");
        TextField name = new TextField();
        Button startButton = new Button("Start");
        
        GridPane layout = new GridPane();
        
        layout.add(instructionText, 0, 0);
        layout.add(name, 0, 1);
        layout.add(startButton, 0, 2);
        
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene nameView = new Scene(layout);
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        startButton.setOnAction((event) -> {
            Label welcomeText = new Label("Welcome " + name.getText() + "!");
            welcomeLayout.getChildren().add(welcomeText);            
            window.setScene(welcomeView);
        });
        
        window.setScene(nameView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
