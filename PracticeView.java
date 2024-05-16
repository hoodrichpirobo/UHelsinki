package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class PracticeView {
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary){
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }
    
    public Parent getView(){
        GridPane layout = new GridPane();
        
        Label wordInstruction = new Label("Translate the word '" + this.word + "'");
        TextField translationField = new TextField();
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        Button addButton = new Button("Check");
        
        Label feedback = new Label("");
        
        layout.add(wordInstruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(addButton, 0, 2);
        layout.add(feedback, 0, 3);
        
        addButton.setOnMouseClicked((event) -> {
            String translation = translationField.getText();
            if(dictionary.get(word).equals(translation)){
                feedback.setText("Correct!");
            }else{
                feedback.setText("Incorrect! The translation to the word '" + word + "' is '" + dictionary.get(word) + "'.");
                return;
            }
            
            this.word = this.dictionary.getRandomWord();
            wordInstruction.setText("Translate the word '" + this.word + "'");
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
