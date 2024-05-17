package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import java.util.*;
import java.nio.file.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.chart.*;

public class PartiesApplication extends Application {
    @Override
    public void start(Stage stage){
        try(Scanner in = new Scanner(Paths.get("partiesdata.tsv"))){
            NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
            NumberAxis yAxis = new NumberAxis(0, 30, 5);

            LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
            lineChart.setTitle("Relative support of the parties");
            
            Map<String, Map<Integer, Double>> values = new HashMap<>();
            
            String years = in.nextLine().trim();
            String[] yearCount = years.split("\t");
            
            while(in.hasNext()){
                String str = in.nextLine().trim();
                String[] pieces = str.split("\t");
                Map<Integer, Double> party = new HashMap<>();
                for(int i = 1; i < pieces.length; i++){
                    int j = Integer.valueOf(yearCount[i]);
                    if (!pieces[i].equals("-")) {
                        party.put(j, Double.valueOf(pieces[i]));
                    }
                }
                values.put(pieces[0], party);
            }
            
            values.keySet().stream().forEach(party ->{
                XYChart.Series data = new XYChart.Series();
                data.setName(party);
                
                values.get(party).entrySet().stream().forEach(pair ->{
                    data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                });
                
                lineChart.getData().add(data);
            });
            
            Scene view = new Scene(lineChart, 640, 480);
            stage.setScene(view);
            stage.show();            
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
