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
import javafx.scene.chart.*;
import java.util.*;

public class ShanghaiApplication extends Application {
    @Override
    public void start(Stage stage){
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        lineChart.setLegendVisible(false); //this makes the ugly zero dissapear
        
        XYChart.Series helData = new XYChart.Series();
        
        Map<Integer, Integer> values = new HashMap<>();
        values.put(2007, 73);   values.put(2008, 68);   values.put(2009, 72);
        values.put(2010, 72);   values.put(2011, 74);   values.put(2012, 74);
        values.put(2013, 76);   values.put(2014, 73);   values.put(2015, 67);
        values.put(2016, 56);   values.put(2017, 56);
        
        values.entrySet().stream().forEach(pair ->{
            helData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
        });
        
        lineChart.getData().add(helData);
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
