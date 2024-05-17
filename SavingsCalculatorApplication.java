package application;

// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.chart.*;
import javafx.scene.layout.*;

public class SavingsCalculatorApplication extends Application {
    @Override
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 125000, 25000);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings calculator");
        
        VBox topMenu = new VBox();
        
        Slider monthlySavingsSlider = new Slider(25, 250, 25);
        monthlySavingsSlider.setShowTickLabels(true);
        monthlySavingsSlider.setShowTickMarks(true);
        
        Slider yearlyInterestSlider = new Slider(0, 10, 0);
        yearlyInterestSlider.setShowTickLabels(true);
        yearlyInterestSlider.setShowTickMarks(true);
        
        Label monthlySavingsLabel = new Label("25.0");
        Label yearlyInterestLabel = new Label("0.0");
        
        monthlySavingsSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            monthlySavingsLabel.setText(String.format("%.0f", newVal.doubleValue()));
            updateChart(lineChart, newVal.doubleValue(), yearlyInterestSlider.getValue());
        });
        
        yearlyInterestSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            yearlyInterestLabel.setText(String.format("%.1f", newVal.doubleValue()));
            updateChart(lineChart, monthlySavingsSlider.getValue(), newVal.doubleValue());
        });
        
        BorderPane firstComponent = new BorderPane();
        firstComponent.setLeft(new Label("Monthly savings"));
        firstComponent.setCenter(monthlySavingsSlider);
        firstComponent.setRight(monthlySavingsLabel);
        
        BorderPane secondComponent = new BorderPane();
        secondComponent.setLeft(new Label("Yearly interest rate"));
        secondComponent.setCenter(yearlyInterestSlider);
        secondComponent.setRight(yearlyInterestLabel);
        
        topMenu.getChildren().addAll(firstComponent, secondComponent);
        layout.setTop(topMenu);
        layout.setCenter(lineChart);
        
        Scene view = new Scene(layout, 800, 600);
        stage.setScene(view);
        stage.show();
    }
    
    private void updateChart(LineChart<Number, Number> lineChart, double monthlySavings, double yearlyInterest){
        lineChart.getData().clear();
        
        XYChart.Series<Number, Number> noInterestSeries = new XYChart.Series<>();
        noInterestSeries.setName("Monthly savings");
        
        XYChart.Series<Number, Number> interestSeries = new XYChart.Series<>();
        interestSeries.setName("Savings with interest");
        
        double noInterestTotal = 0, interestTotal = 0;
        
        for(int year = 0; year <= 30; year++){
            noInterestSeries.getData().add(new XYChart.Data<>(year, noInterestTotal));
            interestSeries.getData().add(new XYChart.Data<>(year, interestTotal));
            
            noInterestTotal += monthlySavings * 12;
            interestTotal = (interestTotal + monthlySavings * 12) * (1 + yearlyInterest / 100);
        }
        
        lineChart.getData().add(noInterestSeries);
        lineChart.getData().add(interestSeries);
    }
    
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
