package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class InputView {
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary){
        this.dictionary = dictionary;
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();
        
        Label wordInstruction = new Label("Word");
        TextField wordField = new TextField();
        Label translationInstruction = new Label("Translation");
        TextField translationField = new TextField();
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        Button addButton = new Button("Add the word pair");
        
        layout.add(wordInstruction, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translationInstruction, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(addButton, 0, 4);
        
        addButton.setOnMouseClicked((event) -> {
            String word = wordField.getText();
            String translation = translationField.getText();
            
            dictionary.add(word, translation);
            
            wordField.clear();
            translationField.clear();
        });
        return layout;
    }
}
//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
