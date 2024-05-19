package collage;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        for (int y = 0; y < height; y += 2) {                                //solo funciona si haces y += 2
            for (int x = 0; x < width; x += 2) {                            //no funciona si haces x++
                Color color = imageReader.getColor(x, y);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(x / 2, y / 2, newColor);                           //(0, 0)
                imageWriter.setColor(width / 2 + x / 2, y / 2, newColor);               //(width/2, 0)
                imageWriter.setColor(x / 2, height / 2 + y / 2, newColor);              //(0, height/2)
                imageWriter.setColor(width / 2 + x / 2, height / 2 + y / 2, newColor);  //(width/2, height/2)
            }
        }

        ImageView imageView = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(imageView);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(CollageApplication.class);
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
